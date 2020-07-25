package com.example.igboamaka.alphabets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.igboamaka.R;
import com.example.igboamaka.colors.Colours;
import com.example.igboamaka.colors.ColoursAdapter;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class AlphabetAdapter extends RecyclerView.Adapter<AlphabetAdapter.ViewHolder>{

    private Context mContext;
    private List<Alphabets> alphabet;

    public AlphabetAdapter(Context context, List<Alphabets> alphabet) {
        mContext = context;
        this.alphabet = alphabet;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.alphabet_item_view, parent, false);
        return new AlphabetAdapter.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.igboTranslation.setText(alphabet.get(position).getIgboTranslation());
        holder.cardView.setCardBackgroundColor(alphabet.get(position).getBackGroundColour());

    }


    @Override
    public int getItemCount() {
        return alphabet.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView igboTranslation;
        MaterialCardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            igboTranslation = itemView.findViewById(R.id.igbo_alphabet);
            cardView = itemView.findViewById(R.id.card_view_alphabet);

        }
    }
}
