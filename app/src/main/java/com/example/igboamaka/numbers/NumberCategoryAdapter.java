package com.example.igboamaka.numbers;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.igboamaka.R;
import com.google.android.material.card.MaterialCardView;

import java.util.Arrays;
import java.util.List;

public class NumberCategoryAdapter extends RecyclerView.Adapter<NumberCategoryAdapter.ViewHolder> {

    private Context mContext;
    private List<Numbers> numbers;

    public NumberCategoryAdapter(Context context, List<Numbers> numbers) {
        mContext = context;
        this.numbers = numbers;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.numbers_item_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.englishDigit.setText(numbers.get(position).getEnglishDigit());
        holder.igboTranslation.setText(numbers.get(position).getIgboTranslation());
        holder.cardView.setCardBackgroundColor(numbers.get(position).getBackGroundColour());
    }


    @Override
    public int getItemCount() {
        return numbers.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView englishDigit;
        TextView igboTranslation;
        MaterialCardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            englishDigit = itemView.findViewById(R.id.english_digit);
            igboTranslation = itemView.findViewById(R.id.igbo_translation);
            cardView = itemView.findViewById(R.id.card_view_number);

        }
    }
}


