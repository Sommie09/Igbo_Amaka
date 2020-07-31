package com.example.igboamaka.funfacts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.igboamaka.R;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class FunFactsAdapter extends RecyclerView.Adapter<FunFactsAdapter.ViewHolder> {

    List<FunFacts> funFacts;
    private Context mContext;

    public FunFactsAdapter(List<FunFacts> funFacts, Context context, ViewPager2 viewPager2) {
        this.funFacts = funFacts;
        mContext = context;
    }

    @NonNull
    @Override
    public FunFactsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.funfacts_item_view, parent, false);
        return new FunFactsAdapter.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull FunFactsAdapter.ViewHolder holder, int position) {
        holder.image.setImageResource(funFacts.get(position).getImage());
        holder.title.setText(funFacts.get(position).getTitle());
        holder.cardView.setCardBackgroundColor(funFacts.get(position).getBackground());
    }


    @Override
    public int getItemCount() {
        return funFacts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView title;
        MaterialCardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.card_title);
            image = itemView.findViewById(R.id.card_image);
            cardView = itemView.findViewById(R.id.card_background);
        }
    }
}
