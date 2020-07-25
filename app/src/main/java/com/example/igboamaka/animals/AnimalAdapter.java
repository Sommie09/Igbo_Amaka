package com.example.igboamaka.animals;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.igboamaka.R;
import com.example.igboamaka.colors.Colours;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ViewHolder> {
    private Context mContext;
    private List<Animals> animal;

    public AnimalAdapter(Context context, List<Animals> animal) {
        mContext = context;
        this.animal = animal;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.animal_item_view, parent, false);
        return new AnimalAdapter.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.englishAnimal.setText(animal.get(position).getEnglishAnimal());
        holder.igboAnimal.setText(animal.get(position).getIgboAnimal());
        holder.animalImage.setImageResource(animal.get(position).getAnimalImage());
        holder.cardView.setCardBackgroundColor(animal.get(position).getBackGroundColour());


    }


    @Override
    public int getItemCount() {
        return animal.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView englishAnimal;
        TextView igboAnimal;
        ImageView animalImage;
        MaterialCardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            englishAnimal = itemView.findViewById(R.id.animal_english);
            igboAnimal = itemView.findViewById(R.id.animal_igbo);
            animalImage = itemView.findViewById(R.id.animal_image);
            cardView = itemView.findViewById(R.id.animal_item_card_view);
        }
    }
}
