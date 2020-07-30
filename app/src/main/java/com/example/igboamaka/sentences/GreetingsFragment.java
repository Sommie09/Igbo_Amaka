package com.example.igboamaka.sentences;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.igboamaka.R;

import java.util.ArrayList;
import java.util.List;


public class GreetingsFragment extends Fragment {
    List<Sentences> sentences;


    public GreetingsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_greetings, container, false);

        sentences = new ArrayList<>();

        sentences.add(new Sentences("Greetings", "Ekene",Color.parseColor("#FF9249")));

        sentences.add(new Sentences("Hello", "Ndewo", Color.parseColor("#B13254")));
        sentences.add(new Sentences("Welcome", "Nnọọ",Color.parseColor("#FF5449")));
        sentences.add(new Sentences("Good morning", "Ụtụtụ ọma",Color.parseColor("#FF9249")));

        sentences.add(new Sentences("Good afternoon", "Ehihie ọma",Color.parseColor("#FF7349")));
        sentences.add(new Sentences("Good evening", "Mgbede ọma",Color.parseColor("#471437")));
        sentences.add(new Sentences("Good night", "Ka chi foo", Color.parseColor("#B13254")));

        sentences.add(new Sentences("Good bye", "Ka emesia",Color.parseColor("#FF5449")));
        sentences.add(new Sentences("See you later", "Ka ọ dị",Color.parseColor("#FF9249")));

        sentences.add(new Sentences("Safe journey", "Ije ọma",Color.parseColor("#FF7349")));
        sentences.add(new Sentences("Yes", "Ee",Color.parseColor("#471437")));
        sentences.add(new Sentences("No", "Mba", Color.parseColor("#B13254")));

        sentences.add(new Sentences("Sorry", "Ndo", Color.parseColor("#B13254")));
        sentences.add(new Sentences("Excuse me", "cheretu",Color.parseColor("#FF5449")));
        sentences.add(new Sentences("Thank you", "Daalụ / Imeela",Color.parseColor("#FF9249")));

        sentences.add(new Sentences("Please", "biko",Color.parseColor("#FF7349")));
        sentences.add(new Sentences("Wait", "chere",Color.parseColor("#471437")));
        sentences.add(new Sentences("My greetings", "Amaghị m.", Color.parseColor("#B13254")));

        sentences.add(new Sentences("See you tomorrow", "Ka o di echi", Color.parseColor("#B13254")));
        sentences.add(new Sentences("Sorry are you Improving?", "Ndo! Eji m aka na ọna ebenata?",Color.parseColor("#FF5449")));
        sentences.add(new Sentences("Come and eat", " Bia rie nri",Color.parseColor("#FF9249")));

        sentences.add(new Sentences("Father, I greet you", " Nna, ekene m gi",Color.parseColor("#FF7349")));
        sentences.add(new Sentences("Mother, I greet you", "Nne, ekene m gi",Color.parseColor("#471437")));
        sentences.add(new Sentences("Are you well now?", "Nso-gbụ gi, ọna go kita?", Color.parseColor("#B13254")));

        sentences.add(new Sentences("I love you", "a hụrụ m gị n'anya",Color.parseColor("#FF9249")));


        RecyclerView recyclerView = view.findViewById(R.id.greetings_recycler_view);
        SentenceCategoryAdapter adapter = new SentenceCategoryAdapter(getContext(), sentences);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}