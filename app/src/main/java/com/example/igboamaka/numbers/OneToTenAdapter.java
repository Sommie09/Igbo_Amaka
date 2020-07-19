package com.example.igboamaka.numbers;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.igboamaka.R;

import java.util.ArrayList;
import java.util.List;

public class OneToTenAdapter extends RecyclerView.Adapter<OneToTenAdapter.ViewHolder> {

    private Context mContext;
    private List<Numbers> numbers;

    public OneToTenAdapter(Context context, List<Numbers> numbers) {
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
    }


    @Override
    public int getItemCount() {
        return numbers.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView englishDigit;
        TextView igboTranslation;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            englishDigit = itemView.findViewById(R.id.english_digit);
            igboTranslation = itemView.findViewById(R.id.igbo_translation);
        }
    }
}


