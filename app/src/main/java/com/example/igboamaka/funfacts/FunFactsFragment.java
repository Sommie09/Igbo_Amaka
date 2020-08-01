package com.example.igboamaka.funfacts;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;

import com.example.igboamaka.R;
import com.example.igboamaka.home.colors.Colours;

import java.util.ArrayList;
import java.util.List;

public class FunFactsFragment extends Fragment {
    private RecyclerView fun_facts_view;
    private FunFactsAdapter adapter;
    private StaggeredGridLayoutManager manager;

    List<FunFacts> funFacts;
    private ViewPager2 mViewPager2;
    private TextView swipe_text;


    public FunFactsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fun_facts, container, false);

        mViewPager2 = rootView.findViewById(R.id.pager);
        swipe_text = rootView.findViewById(R.id.swipe_text);

        funFacts = new ArrayList<>();
        funFacts.add(new FunFacts(
                "Cloths in the land have a significant meaning or purpose",
                R.drawable.igbo_dressing,
                "DRESSING"));

        funFacts.add(new FunFacts(
                "Igbo proverbs are wise sayings in igbo language",
                R.drawable.kolanut,
                "PROVERBS"));

        funFacts.add(new FunFacts(
                "Igbo foods are very easy and simple to cook and eat",
                R.drawable.abacha,
                "FOOD"));

        funFacts.add(new FunFacts(
                "The Igbos are more than 25% of the population in some Nigerian States",
                R.drawable.map,
                "EASTERN STATES"));

        funFacts.add(new FunFacts(
                "Igbo names are traditionally and historically constructed",
                R.drawable.names22,
                "IGBO NAMES"));


        mViewPager2.setAdapter(new FunFactsAdapter(funFacts, getContext(), mViewPager2 ));
        mViewPager2.setClipToPadding(false);
        mViewPager2.setClipChildren(false);
        mViewPager2.setOffscreenPageLimit(3);
        mViewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);


        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(90));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });

        mViewPager2.setPageTransformer(compositePageTransformer);

        manageBlinkEffect();

        return rootView;
    }

    private void manageBlinkEffect(){
        ObjectAnimator anim = ObjectAnimator.ofInt(swipe_text, "textColor",Color.parseColor("#FF9249"),
                Color.WHITE, Color.parseColor("#FF9249"));
        anim.setDuration(1000);
        anim.setEvaluator(new ArgbEvaluator());
        anim.setRepeatCount(Animation.INFINITE);
        anim.start();


    }
}