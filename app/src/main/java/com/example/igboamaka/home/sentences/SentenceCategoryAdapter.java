package com.example.igboamaka.home.sentences;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.igboamaka.R;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

import static android.media.AudioManager.AUDIOFOCUS_GAIN;

public class SentenceCategoryAdapter extends RecyclerView.Adapter<SentenceCategoryAdapter.ViewHolder> {

    private  Context mContext;
    private  List<Sentences> sentences;
    private static RecyclerViewClickListener listener;


    public SentenceCategoryAdapter(Context context, List<Sentences> sentences, RecyclerViewClickListener listener) {
        mContext = context;
        this.sentences = sentences;
        SentenceCategoryAdapter.listener = listener;
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

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView englishSentence;
        TextView igboSentence;
        MaterialCardView cardView;
        public ViewHolder(@NonNull final View itemView) {
            super(itemView);

            englishSentence = itemView.findViewById(R.id.english_text);
            igboSentence = itemView.findViewById(R.id.igbo_text);
            cardView = itemView.findViewById(R.id.profile_card_names);
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


