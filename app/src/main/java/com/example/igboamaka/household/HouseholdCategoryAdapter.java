package com.example.igboamaka.household;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.igboamaka.R;
import com.example.igboamaka.numbers.NumberCategoryAdapter;
import com.example.igboamaka.numbers.Numbers;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class HouseholdCategoryAdapter extends RecyclerView.Adapter<HouseholdCategoryAdapter.ViewHolder>{

    private Context mContext;
    private List<HouseHold> houseHold;

    public HouseholdCategoryAdapter(Context context, List<HouseHold> houseHold) {
        mContext = context;
        this.houseHold = houseHold;
    }

    @NonNull
    @Override
    public HouseholdCategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.household_item_view, parent, false);
        return new HouseholdCategoryAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HouseholdCategoryAdapter.ViewHolder holder, int position) {
        holder.englishItem.setText(houseHold.get(position).getEnglishItem());
        holder.igboItem.setText(houseHold.get(position).getIgboItem());
        holder.cardView.setCardBackgroundColor(houseHold.get(position).getColour());
    }


    @Override
    public int getItemCount() {
        return houseHold.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView englishItem;
        TextView igboItem;
        MaterialCardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            englishItem = itemView.findViewById(R.id.english_household);
            igboItem = itemView.findViewById(R.id.igbo_household);
            cardView = itemView.findViewById(R.id.card_view_household);

        }
    }





}
