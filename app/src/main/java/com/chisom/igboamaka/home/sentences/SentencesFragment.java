package com.chisom.igboamaka.home.sentences;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chisom.igboamaka.R;

import java.util.ArrayList;
import java.util.List;


public class SentencesFragment extends Fragment {
    List<Sentences> sentences;


    public SentencesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sentences, container, false);

        sentences = new ArrayList<>();

        sentences.add(new Sentences("What is your name?", "Gịnị bu aha gị?", Color.parseColor("#B13254"),R.raw.whatisyourname));
        sentences.add(new Sentences("My name is Chisom", "Aha m bụ Chisom",Color.parseColor("#FF5449"),R.raw.mynameischisom));
        sentences.add(new Sentences("How are they doing?", "Kedu ka ha melu?",Color.parseColor("#FF9249"),R.raw.howarethey));

        sentences.add(new Sentences("They are doing fine", "Ha dị mma",Color.parseColor("#FF7349"),R.raw.theyarefine));



        sentences.add(new Sentences("Who is this?", "Kedu onye bụ nke a? ",Color.parseColor("#471437"),R.raw.whoisthis));

        sentences.add(new Sentences("Do you speak Igbo", "I na-asu Igbo?", Color.parseColor("#B13254"),R.raw.speak));
        sentences.add(new Sentences("What is she doing?", "Kedu ihe o na-eme?",Color.parseColor("#FF5449"),R.raw.whatisshedoing));
        sentences.add(new Sentences("Where are you from?", "Ị bu onye ebee?",Color.parseColor("#FF9249"),R.raw.from));

        sentences.add(new Sentences("I am from Anambra", "Abu m onye Anambra",Color.parseColor("#FF7349"),R.raw.anambra));

        sentences.add(new Sentences("I remember", "Echetara m",Color.parseColor("#B13254"),R.raw.remeber));
        sentences.add(new Sentences("He/She is a nice person", "Ọ bụ ezigbo mmadụ",Color.parseColor("#FF5449"),R.raw.good_person));
        sentences.add(new Sentences("You are pretty", "Ị mara mma nwanyị", Color.parseColor("#FF9249"),R.raw.pretty));
        sentences.add(new Sentences("My strength is finished", "ike gwuru",Color.parseColor("#FF5449"),R.raw.strength));

        sentences.add(new Sentences("She is cooking breakfast", "O na-esi nri ụtụtụ", Color.parseColor("#B13254"),R.raw.breakfast));
        sentences.add(new Sentences("We are going home", "Anyị na-aga ụlọ",Color.parseColor("#FF5449"),R.raw.goinghome));
        sentences.add(new Sentences("Where we are going?", "Ebee ka anyị na-aga?",Color.parseColor("#FF9249"),R.raw.wherearewegoing));


        sentences.add(new Sentences("What do you mean?", "gịnị ka ị chere?",Color.parseColor("#FF7349"),R.raw.whatdoyoumean));
        sentences.add(new Sentences("You are a nice person", "Ị bụ ezigbo mmadụ",Color.parseColor("#471437"),R.raw.youareagoodperon));
        sentences.add(new Sentences("You are tall", "Ị toro ogologo", Color.parseColor("#B13254"),R.raw.tallyou));

        sentences.add(new Sentences("Go straight", "gaba n'iru",Color.parseColor("#FF7349"),R.raw.moveforward));
        sentences.add(new Sentences("Turn left", "ba na aka-nri",Color.parseColor("#471437"),R.raw.right));
        sentences.add(new Sentences("Turn right", "ba na aka-ekpe", Color.parseColor("#B13254"),R.raw.left));

        sentences.add(new Sentences("I need a doctor", "a chọrọ m dibia oyibo", Color.parseColor("#B13254"),R.raw.doctor));
        sentences.add(new Sentences("It was nice talking to you", "ọ maka ikpara gị nkata",Color.parseColor("#FF5449"),R.raw.nicemeetingyou));


        SentenceAdapter.RecyclerViewClickListener listener = new SentenceAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                MediaPlayer mediaPlayer = MediaPlayer.create(view.getContext(), sentences.get(position).getAudio());
                mediaPlayer.start();
            }
        };

        RecyclerView recyclerView = view.findViewById(R.id.sentence_recycler_view);
        SentenceAdapter adapter = new SentenceAdapter(getContext(), sentences, listener);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}