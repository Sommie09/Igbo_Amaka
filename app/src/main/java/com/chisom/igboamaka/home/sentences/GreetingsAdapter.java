package com.chisom.igboamaka.home.sentences;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chisom.igboamaka.R;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class GreetingsAdapter extends RecyclerView.Adapter<GreetingsAdapter.ViewHolder> {

    private final Context mContext;
    private final List<Sentences> sentences;
    private static RecyclerViewClickListener listener;


    public GreetingsAdapter(Context context, List<Sentences> sentences, RecyclerViewClickListener listener) {
        mContext = context;
        this.sentences = sentences;
        GreetingsAdapter.listener = listener;
    }


    @NonNull
    @Override
    public GreetingsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.greetings_item_view, parent, false);
        return new GreetingsAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GreetingsAdapter.ViewHolder holder, int position) {
        holder.englishSentence.setText(sentences.get(position).getEnglishSentence());
        holder.igboSentence.setText(sentences.get(position).getIgboSentence());
        holder.cardView.setCardBackgroundColor(sentences.get(position).getProfileBackgroundColour());
    }


    @Override
    public int getItemCount() {
        return sentences.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        final TextView englishSentence;
        final TextView igboSentence;
        final MaterialCardView cardView;
        public ViewHolder(@NonNull final View itemView) {
            super(itemView);

            englishSentence = itemView.findViewById(R.id.english_greeting);
            igboSentence = itemView.findViewById(R.id.igbo_greeting);
            cardView = itemView.findViewById(R.id.profile_card_names_greeting);
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


