package com.example.igboamaka.funfacts;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.viewpager.widget.PagerAdapter;


import com.example.igboamaka.R;
import com.example.igboamaka.funfacts.dressing.DressingActivity;
import com.example.igboamaka.funfacts.food.FoodActivity;
import com.example.igboamaka.funfacts.names.NamesActivity;
import com.example.igboamaka.funfacts.proverbs.ProverbsActivity;
import com.example.igboamaka.funfacts.states.StateActivity;

import java.util.List;

public class FunFactsAdapter extends PagerAdapter {

    final List<FunFacts> funFacts;
    final Context mContext;

    public FunFactsAdapter(List<FunFacts> funFacts, Context context) {
        this.funFacts = funFacts;
        mContext = context;
    }

    @Override
    public int getCount() {
        return funFacts.size();
    }


    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.funfacts_item_view, container, false);

        ImageView funfacts_image = view.findViewById(R.id.funfacts_image);
        TextView funfacts_title = view.findViewById(R.id.funfacts_title);
        TextView funfacts_description = view.findViewById(R.id.funfacts_description);

        funfacts_image.setImageResource(funFacts.get(position).getImage());
        funfacts_title.setText(funFacts.get(position).getTitle());
        funfacts_description.setText(funFacts.get(position).getDescription());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (position){
                    case 0:
                        Intent dressingIntent = new Intent(mContext, DressingActivity.class);
                        mContext.startActivity(dressingIntent);
                        break;
                    case 1:
                        Intent proverbsIntent = new Intent(mContext, ProverbsActivity.class);
                        mContext.startActivity(proverbsIntent);
                        break;
                    case 2:
                        Intent foodIntent = new Intent(mContext, FoodActivity.class);
                        mContext.startActivity(foodIntent);
                        break;

                        case 3:
                        Intent statesIntent = new Intent(mContext, StateActivity.class);
                        mContext.startActivity(statesIntent);
                        break;
                    case 4:
                        Intent namesIntent = new Intent(mContext, NamesActivity.class);
                        mContext.startActivity(namesIntent);
                        break;

                }
            }
        });

        container.addView(view);

        return view;
    }
}
