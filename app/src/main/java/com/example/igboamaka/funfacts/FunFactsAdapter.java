package com.example.igboamaka.funfacts;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import androidx.viewpager.widget.PagerAdapter;


import com.example.igboamaka.R;
import com.example.igboamaka.funfacts.food.FoodActivity;

import java.util.List;

public class FunFactsAdapter extends PagerAdapter {

    List<FunFacts> funFacts;
    Context mContext;

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

               Intent intent = new Intent(mContext, FoodActivity.class);
               mContext.startActivity(intent);

            }
        });

        container.addView(view);

        return view;
    }
}
