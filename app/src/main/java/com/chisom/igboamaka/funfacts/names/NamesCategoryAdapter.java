package com.chisom.igboamaka.funfacts.names;

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

public class NamesCategoryAdapter extends RecyclerView.Adapter<NamesCategoryAdapter.ViewHolder> {
    private final Context mContext;
    private final List<Names> names;

    public NamesCategoryAdapter(Context context, List<Names> names) {
        mContext = context;
        this.names = names;
    }


    @NonNull
    @Override
    public NamesCategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.names_item_view, parent, false);
        return new NamesCategoryAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NamesCategoryAdapter.ViewHolder holder, int position) {
        holder.igboName.setText(names.get(position).getIgboName());
        holder.englishName.setText(names.get(position).getIgboMeaning());
        holder.cardView.setCardBackgroundColor(names.get(position).getTagColour());
    }


    @Override
    public int getItemCount() {
        return names.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView igboName;
        final TextView englishName;
        final MaterialCardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            igboName = itemView.findViewById(R.id.igbo_name);
            englishName = itemView.findViewById(R.id.english_name);
            cardView = itemView.findViewById(R.id.profile_card_names);

        }
    }
}
