package com.example.igboamaka.home.family;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.igboamaka.R;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class FamilyAdapter extends RecyclerView.Adapter<FamilyAdapter.ViewHolder> {
    private Context mContext;
    private List<Family> family;
    private static RecyclerViewClickListener listener;

    public FamilyAdapter(Context context, List<Family> family, FamilyAdapter.RecyclerViewClickListener listener) {
        mContext = context;
        this.family = family;
        this.listener = listener;
    }

    @NonNull
    @Override
    public FamilyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.family_item_view, parent, false);
        return new FamilyAdapter.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull FamilyAdapter.ViewHolder holder, int position) {
        holder.englishFamily.setText(family.get(position).getEnglishFamily());
        holder.igboFamily.setText(family.get(position).getIgboFamily());
        holder.familyImage.setImageResource(family.get(position).getFamilyImage());
        holder.cardView.setCardBackgroundColor(family.get(position).getBackGroundColour());


    }


    @Override
    public int getItemCount() {
        return family.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView englishFamily;
        TextView igboFamily;
        ImageView familyImage;
        MaterialCardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            englishFamily = itemView.findViewById(R.id.family_english);
            igboFamily = itemView.findViewById(R.id.family_igbo);
            familyImage = itemView.findViewById(R.id.family_image);
            cardView = itemView.findViewById(R.id.family_item_card_view);
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
