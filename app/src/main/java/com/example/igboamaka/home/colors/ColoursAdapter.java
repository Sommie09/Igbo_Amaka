package com.example.igboamaka.home.colors;

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

public class ColoursAdapter extends RecyclerView.Adapter<ColoursAdapter.ViewHolder> {

    private final Context mContext;
    private final List<Colours> colours;
    private static RecyclerViewClickListener listener;

    public ColoursAdapter(Context context, List<Colours> colours, RecyclerViewClickListener listener) {
        mContext = context;
        this.colours = colours;
        ColoursAdapter.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.colours_item_view, parent, false);
        return new ColoursAdapter.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.englishColour.setText(colours.get(position).getEnglishTranslation());
        holder.igboColour.setText(colours.get(position).getIgboTranslation());
        holder.englishColour.setTextColor(colours.get(position).getTextColour());
        holder.igboColour.setTextColor(colours.get(position).getTextColour());
        holder.cardView.setCardBackgroundColor(colours.get(position).getBackGroundColour());
    }


    @Override
    public int getItemCount() {
        return colours.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        final TextView englishColour;
        final TextView igboColour;
        final MaterialCardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            englishColour = itemView.findViewById(R.id.englishColour);
            igboColour = itemView.findViewById(R.id.igboColour);
            cardView = itemView.findViewById(R.id.colour_card_view_item);
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
