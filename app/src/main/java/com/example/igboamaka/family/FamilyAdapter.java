package com.example.igboamaka.family;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.igboamaka.R;
import com.example.igboamaka.animals.AnimalAdapter;
import com.example.igboamaka.animals.Animals;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class FamilyAdapter extends RecyclerView.Adapter<FamilyAdapter.ViewHolder> {
    private Context mContext;
    private List<Family> family;

    public FamilyAdapter(Context context, List<Family> family) {
        mContext = context;
        this.family = family;
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
        holder.familyIgbo.setText(family.get(position).getFamilyIgbo());
        holder.familyEnglish.setText(family.get(position).getFamilyEnglish());
        holder.familyImage.setImageResource(family.get(position).getFamilyImage());
        holder.cardView.setCardBackgroundColor(family.get(position).getBackGroundColour());

    }


    @Override
    public int getItemCount() {
        return family.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView familyIgbo;
        TextView familyEnglish;
        ImageView familyImage;
        MaterialCardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            familyIgbo = itemView.findViewById(R.id.family_igbo);
            familyEnglish = itemView.findViewById(R.id.family_english);
            familyImage = itemView.findViewById(R.id.family_image);
            cardView = itemView.findViewById(R.id.family_item_card_view);
        }
    }
}
