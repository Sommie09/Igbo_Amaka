package com.example.igboamaka;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.igboamaka.alphabets.Alphabets;
import com.example.igboamaka.alphabets.AlphabetsActivity;
import com.example.igboamaka.animals.AnimalActivity;
import com.example.igboamaka.colors.ColoursActivity;
import com.example.igboamaka.numbers.NumbersActivity;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.TabLayout;


public class HomeFragment extends Fragment {
    MaterialCardView numbersCard, coloursCard, alphabetCard, animalsCard;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        DashboardPagerAdapter pagerAdapter = new DashboardPagerAdapter((getChildFragmentManager()));
        ViewPager viewPager =  rootView.findViewById(R.id.pager);
        viewPager.setAdapter(pagerAdapter);

        TabLayout tabLayout = rootView.findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        return rootView;
    }
}