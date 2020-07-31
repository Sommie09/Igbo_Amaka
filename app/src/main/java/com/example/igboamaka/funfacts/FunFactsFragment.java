package com.example.igboamaka.funfacts;

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


    public FunFactsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fun_facts, container, false);

        mViewPager2 = rootView.findViewById(R.id.pager);

        funFacts = new ArrayList<>();
        funFacts.add(new FunFacts(
                R.drawable.igbo_dressing,
                Color.parseColor("#8B4513"),
                "DRESSING"));

        funFacts.add(new FunFacts(
                R.drawable.igbo_dressing,
                Color.parseColor("#8B4513"),
                "PROVERBS"));

        funFacts.add(new FunFacts(
                R.drawable.igbo_dressing,
                Color.parseColor("#8B4513"),
                "FOOD"));

        funFacts.add(new FunFacts(
                R.drawable.igbo_dressing,
                Color.parseColor("#8B4513"),
                "EASTERN STATES"));

        funFacts.add(new FunFacts
                (R.drawable.igbo_dressing,
                        Color.parseColor("#8B4513"),
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



//        fun_facts_view = (RecyclerView) rootView.findViewById(R.id.funfacts_recycler_view);
//        manager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
//
//        fun_facts_view.setLayoutManager(manager);
//
//        funFacts = new ArrayList<>();
//        funFacts.add(new FunFacts(R.drawable.igbo_dressing, Color.parseColor("#8B4513"), "DRESSING"));
//        funFacts.add(new FunFacts(R.drawable.igbo_dressing, Color.parseColor("#8B4513"), "PROVERBS"));
//        funFacts.add(new FunFacts(R.drawable.igbo_dressing, Color.parseColor("#8B4513"), "FOOD"));
//        funFacts.add(new FunFacts(R.drawable.igbo_dressing, Color.parseColor("#8B4513"), "EASTERN STATES"));
//        funFacts.add(new FunFacts(R.drawable.igbo_dressing, Color.parseColor("#8B4513"), "IGBO NAMES"));
//
//        adapter = new FunFactsAdapter(funFacts, getContext());
//        fun_facts_view.setAdapter(adapter);





        return rootView;
    }
}