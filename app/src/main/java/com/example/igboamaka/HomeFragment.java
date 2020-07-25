package com.example.igboamaka;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.igboamaka.alphabets.Alphabets;
import com.example.igboamaka.alphabets.AlphabetsActivity;
import com.example.igboamaka.animals.AnimalActivity;
import com.example.igboamaka.colors.ColoursActivity;
import com.example.igboamaka.numbers.NumbersActivity;
import com.google.android.material.card.MaterialCardView;


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

        alphabetCard = rootView.findViewById(R.id.alphabet_card);
        alphabetCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), AlphabetsActivity.class);
                startActivity(intent);
            }
        });

        animalsCard = rootView.findViewById(R.id.animals_card);
        animalsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), AnimalActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}