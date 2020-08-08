package com.example.igboamaka.home.bodyparts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.igboamaka.R;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class BodyPartAdapter extends RecyclerView.Adapter<BodyPartAdapter.ViewHolder> {
    private final Context mContext;
    private final List<BodyParts> bodyparts;
    private static BodyPartAdapter.RecyclerViewClickListener listener;

    public BodyPartAdapter(Context context, List<BodyParts> bodyParts, BodyPartAdapter.RecyclerViewClickListener listener) {
        mContext = context;
        this.bodyparts = bodyParts;
        BodyPartAdapter.listener = listener;
    }

    @NonNull
    @Override
    public BodyPartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.bodyparts_item_view, parent, false);
        return new BodyPartAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BodyPartAdapter.ViewHolder holder, int position) {
        holder.englishItem.setText(bodyparts.get(position).getEnglishPart());
        holder.igboItem.setText(bodyparts.get(position).getIgboPart());
        holder.cardView.setCardBackgroundColor(bodyparts.get(position).getColour());
    }


    @Override
    public int getItemCount() {
        return bodyparts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        final TextView englishItem;
        final TextView igboItem;
        final MaterialCardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            englishItem = itemView.findViewById(R.id.english_part);
            igboItem = itemView.findViewById(R.id.igbo_part);
            cardView = itemView.findViewById(R.id.card_view_bodyparts);
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
