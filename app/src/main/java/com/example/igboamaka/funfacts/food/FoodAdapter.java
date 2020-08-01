package com.example.igboamaka.funfacts.food;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.igboamaka.R;
import com.example.igboamaka.home.family.Family;
import com.example.igboamaka.home.family.FamilyAdapter;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    private Context mContext;
    private List<Food> foods;

    public FoodAdapter(Context context, List<Food> foods) {
        mContext = context;
        this.foods = foods;
    }

    @NonNull
    @Override
    public FoodAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.food_item_view, parent, false);
        return new FoodAdapter.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.ViewHolder holder, int position) {
        holder.foodName.setText(foods.get(position).getFoodName());
        holder.foodImage.setImageResource(foods.get(position).getFoodImage());
        holder.cardView.setCardBackgroundColor(foods.get(position).getFoodBackground());

    }


    @Override
    public int getItemCount() {
        return foods.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView foodName;
        ImageView foodImage;
        MaterialCardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            foodName = itemView.findViewById(R.id.food_name);
            foodImage = itemView.findViewById(R.id.food_image);
            cardView = itemView.findViewById(R.id.food_card);
        }
    }
}
