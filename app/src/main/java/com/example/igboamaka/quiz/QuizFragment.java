package com.example.igboamaka.quiz;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.igboamaka.R;
import com.example.igboamaka.quiz.animals.AnimalQuizFragment;
import com.example.igboamaka.quiz.bodyparts.BodyPartsQuizFragment;
import com.example.igboamaka.quiz.colour.ColourQuizFragment;
import com.example.igboamaka.quiz.family.FamilyQuizFragment;
import com.example.igboamaka.quiz.numbers.NumberQuizFragment;
import com.example.igboamaka.quiz.sentences.SentenceQuizFragment;
import com.google.android.material.card.MaterialCardView;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class QuizFragment extends Fragment {
    MaterialCardView numberQuizCard, sentenceQuizCard, coloursCard, familyCard, animalCard, bodyPartsCard;


    public QuizFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = getLayoutInflater().inflate(R.layout.fragment_quiz, container, false);

        numberQuizCard =  view.findViewById(R.id.numbers_quiz_card);
        numberQuizCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new NumberQuizFragment();
                FragmentManager fragmentManager = Objects.requireNonNull(getActivity()).getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        sentenceQuizCard =  view.findViewById(R.id.sentences_card_quiz);
        sentenceQuizCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new SentenceQuizFragment();
                FragmentManager fragmentManager = Objects.requireNonNull(getActivity()).getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        coloursCard =  view.findViewById(R.id.colours_quiz_card);
        coloursCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new ColourQuizFragment();
                FragmentManager fragmentManager = Objects.requireNonNull(getActivity()).getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        familyCard =  view.findViewById(R.id.family_quiz_card);
        familyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new FamilyQuizFragment();
                FragmentManager fragmentManager = Objects.requireNonNull(getActivity()).getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        animalCard =  view.findViewById(R.id.animal_quiz_card);
        animalCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new AnimalQuizFragment();
                FragmentManager fragmentManager = Objects.requireNonNull(getActivity()).getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        bodyPartsCard =  view.findViewById(R.id.bodyparts_card_quiz);
        bodyPartsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new BodyPartsQuizFragment();
                FragmentManager fragmentManager = Objects.requireNonNull(getActivity()).getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });





        return view;
    }
}