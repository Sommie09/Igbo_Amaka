package com.example.igboamaka.sentences;

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

public class SentenceCategoryAdapter extends RecyclerView.Adapter<SentenceCategoryAdapter.ViewHolder> {

    private Context mContext;
    private List<Sentences> sentences;

    public SentenceCategoryAdapter(Context context, List<Sentences> sentences) {
        mContext = context;
        this.sentences = sentences;
    }


    @NonNull
    @Override
    public SentenceCategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.sentence_item_view, parent, false);
        return new SentenceCategoryAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SentenceCategoryAdapter.ViewHolder holder, int position) {
        holder.englishSentence.setText(sentences.get(position).getEnglishSentence());
        holder.igboSentence.setText(sentences.get(position).getIgboSentence());
        holder.cardView.setCardBackgroundColor(sentences.get(position).getProfileBackgroundColour());
    }


    @Override
    public int getItemCount() {
        return sentences.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView englishSentence;
        TextView igboSentence;
        MaterialCardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            englishSentence = itemView.findViewById(R.id.english_text);
            igboSentence = itemView.findViewById(R.id.igbo_text);
            cardView = itemView.findViewById(R.id.profile_card);

        }
    }
}
