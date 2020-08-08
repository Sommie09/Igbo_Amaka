package com.example.igboamaka.funfacts;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;

import com.example.igboamaka.R;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class FunFactsFragment extends Fragment {

    List<FunFacts> funFacts;
    HorizontalInfiniteCycleViewPager viewPager;
    private TextView swipe_text;



    public FunFactsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fun_facts, container, false);

        funFacts = new ArrayList<>();

        initializeData();

        viewPager = rootView.findViewById(R.id.view_pager);

        FunFactsAdapter adapter = new FunFactsAdapter(funFacts, getContext());
        viewPager.setAdapter(adapter);

        swipe_text = rootView.findViewById(R.id.swipe_text);


        manageBlinkEffect();

        return rootView;
    }

    public void initializeData() {
        funFacts.add(new FunFacts(
                "Cloths in the land have a significant meaning or purpose",
                R.drawable.igbo_women,
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