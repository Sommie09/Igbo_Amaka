package com.example.igboamaka.home.numbers;

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

public class HundredsAdapter extends RecyclerView.Adapter<HundredsAdapter.ViewHolder> {

    private Context mContext;
    private List<Numbers> numbers;
    private static RecyclerViewClickListener listener;


    public HundredsAdapter(Context context, List<Numbers> numbers, RecyclerViewClickListener listener) {
        mContext = context;
        this.numbers = numbers;
        this.listener = listener;
    }

    public HundredsAdapter(Context context, List<Numbers> numbers) {
        mContext = context;
        this.numbers = numbers;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.numbers_hundreds_item_view, parent, false);
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

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView englishDigit;
        TextView igboTranslation;
        MaterialCardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            englishDigit = itemView.findViewById(R.id.hundreds_english_digit);
            igboTranslation = itemView.findViewById(R.id.hundreds_igbo);
            cardView = itemView.findViewById(R.id.card_view_hundreds);
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


