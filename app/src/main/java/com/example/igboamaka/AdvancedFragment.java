package com.example.igboamaka;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.igboamaka.alphabets.AlphabetsActivity;
import com.example.igboamaka.animals.AnimalActivity;
import com.example.igboamaka.colors.ColoursActivity;
import com.example.igboamaka.family.FamilyActivity;
import com.example.igboamaka.numbers.NumbersActivity;
import com.google.android.material.card.MaterialCardView;


public class AdvancedFragment extends Fragment {
    MaterialCardView familyCard, bodyPartsCard, simpleSentences, houseHoldItems;


    public AdvancedFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_advanced, container, false);


        familyCard = rootView.findViewById(R.id.family_card);
        familyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), FamilyActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}