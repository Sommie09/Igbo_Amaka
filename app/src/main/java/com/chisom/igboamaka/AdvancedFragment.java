package com.chisom.igboamaka;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chisom.igboamaka.home.bodyparts.BodyPartsActivity;
import com.chisom.igboamaka.home.family.FamilyActivity;
import com.chisom.igboamaka.home.household.HouseHoldActivity;
import com.chisom.igboamaka.home.sentences.SentencesActivity;
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

        simpleSentences = rootView.findViewById(R.id.sentences_card);
        simpleSentences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SentencesActivity.class);
                startActivity(intent);
            }
        });

        houseHoldItems = rootView.findViewById(R.id.household_card);
        houseHoldItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), HouseHoldActivity.class);
                startActivity(intent);
            }
        });

        bodyPartsCard = rootView.findViewById(R.id.body_parts_card);
        bodyPartsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BodyPartsActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}