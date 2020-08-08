package com.chisom.igboamaka.funfacts.proverbs;

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

public class ProverbsAdapter extends RecyclerView.Adapter<ProverbsAdapter.ViewHolder> {
    private final Context mContext;
    private final List<Proverbs> proverbs;
    private static RecyclerViewClickListener listener;

    public ProverbsAdapter(Context context, List<Proverbs> proverbs, RecyclerViewClickListener listener) {
        mContext = context;
        this.proverbs = proverbs;
        ProverbsAdapter.listener = listener;
    }


    @NonNull
    @Override
    public ProverbsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.proverbs_item_view, parent, false);
        return new ProverbsAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProverbsAdapter.ViewHolder holder, int position) {
        holder.igboProverb.setText(proverbs.get(position).getIgboProverb());
        holder.englishProverb.setText(proverbs.get(position).getEnglishProverb());
        holder.cardView.setCardBackgroundColor(proverbs.get(position).getProfileBackgroundColour());
    }


    @Override
    public int getItemCount() {
        return proverbs.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        final TextView igboProverb;
        final TextView englishProverb;
        final MaterialCardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            igboProverb = itemView.findViewById(R.id.igbo_proverb);
            englishProverb = itemView.findViewById(R.id.english_proverb);
            cardView = itemView.findViewById(R.id.profile_card_proverbs);
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
