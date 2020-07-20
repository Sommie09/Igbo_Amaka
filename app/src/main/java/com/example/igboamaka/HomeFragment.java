package com.example.igboamaka;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.igboamaka.colors.ColoursActivity;
import com.example.igboamaka.numbers.NumbersActivity;
import com.google.android.material.card.MaterialCardView;


public class HomeFragment extends Fragment {
    MaterialCardView numbersCard;
    MaterialCardView coloursCard;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        numbersCard = rootView.findViewById(R.id.numbers_card);
        numbersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), NumbersActivity.class);
                startActivity(intent);
            }
        });

        coloursCard = rootView.findViewById(R.id.colours_card);
        coloursCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ColoursActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}