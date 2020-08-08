package com.chisom.igboamaka.home.household;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chisom.igboamaka.R;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class BedroomAdapter extends RecyclerView.Adapter<BedroomAdapter.ViewHolder>{

    private final Context mContext;
    private final List<HouseHold> houseHold;
    private static RecyclerViewClickListener listener;

    public BedroomAdapter(Context context, List<HouseHold> houseHold, RecyclerViewClickListener listener) {
        mContext = context;
        this.houseHold = houseHold;
        BedroomAdapter.listener = listener;
    }

    @NonNull
    @Override
    public BedroomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.bedroom_item_view, parent, false);
        return new BedroomAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BedroomAdapter.ViewHolder holder, int position) {
        holder.englishItem.setText(houseHold.get(position).getEnglishItem());
        holder.igboItem.setText(houseHold.get(position).getIgboItem());
        holder.cardView.setCardBackgroundColor(houseHold.get(position).getColour());
    }


    @Override
    public int getItemCount() {
        return houseHold.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        final TextView englishItem;
        final TextView igboItem;
        final MaterialCardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            englishItem = itemView.findViewById(R.id.english_bedroom);
            igboItem = itemView.findViewById(R.id.igbo_bedroom);
            cardView = itemView.findViewById(R.id.card_view_bedroom);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            listener.onClick(view, getAdapterPosition());
        }
    }

    public interface RecyclerViewClickListener{
        void onClick(View view, int position);
    }





}
