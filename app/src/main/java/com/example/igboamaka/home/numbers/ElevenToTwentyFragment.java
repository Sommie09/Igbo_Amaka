package com.example.igboamaka.home.numbers;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.igboamaka.R;

import java.util.ArrayList;
import java.util.List;


public class ElevenToTwentyFragment extends Fragment {
    List<Numbers> mNumbersList;
    private NumberCategoryAdapter.RecyclerViewClickListener listener;


    public ElevenToTwentyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one_to_ten, container, false);

        mNumbersList = new ArrayList<>();

        mNumbersList.add(new Numbers("11", "iri na otu", Color.parseColor("#B13254"),R.raw.number_two));
        mNumbersList.add(new Numbers("12", "iri na abụọ",Color.parseColor("#FF5449"),R.raw.number_two));
        mNumbersList.add(new Numbers("13", "iri na atọ",Color.parseColor("#FF9249"),R.raw.number_two));

        mNumbersList.add(new Numbers("14", "iri na anọ",Color.parseColor("#FF7349"),R.raw.number_two));
        mNumbersList.add(new Numbers("15", "iri na ise",Color.parseColor("#471437"),R.raw.number_two));
        mNumbersList.add(new Numbers("16", "iri na isii",Color.parseColor("#B13254"),R.raw.number_two));

        mNumbersList.add(new Numbers("17", "iri na asaa",Color.parseColor("#FF9249"),R.raw.number_two));
        mNumbersList.add(new Numbers("18", "iri na asato",Color.parseColor("#FF5449"),R.raw.number_two));
        mNumbersList.add(new Numbers("19", "iri na itoolu",Color.parseColor("#FF9249"),R.raw.number_two));

        mNumbersList.add(new Numbers("20", "iri abụọ",Color.parseColor("#FF7349"),R.raw.number_two));
        mNumbersList.add(new Numbers("21", "iri abụọ na otu",Color.parseColor("#471437"),R.raw.number_two));
        mNumbersList.add(new Numbers("22", "iri abụọ na abụọ",Color.parseColor("#B13254"),R.raw.number_two));

        mNumbersList.add(new Numbers("23", "iri abụọ na atọ",Color.parseColor("#FF9249"),R.raw.number_two));
        mNumbersList.add(new Numbers("24", "iri abụọ na anọ",Color.parseColor("#FF5449"),R.raw.number_two));
        mNumbersList.add(new Numbers("25", "iri abụọ na ise",Color.parseColor("#FF9249"),R.raw.number_two));

        mNumbersList.add(new Numbers("26", "iri abụọ na isii",Color.parseColor("#FF7349"),R.raw.number_two));
        mNumbersList.add(new Numbers("27", "iri abụọ na asaa",Color.parseColor("#471437"),R.raw.number_two));
        mNumbersList.add(new Numbers("28", "iri abụọ na asato",Color.parseColor("#B13254"),R.raw.number_two));

        mNumbersList.add(new Numbers("29", "iri abụọ na itoolu",Color.parseColor("#FF9249"),R.raw.number_two));
        mNumbersList.add(new Numbers("30", "iri atọ",Color.parseColor("#FF5449"),R.raw.number_two));

        listener = new NumberCategoryAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                MediaPlayer mediaPlayer = MediaPlayer.create(view.getContext(), mNumbersList.get(position).getAudio());
                mediaPlayer.start();
            }
        };



        RecyclerView recyclerView = view.findViewById(R.id.numbers_recycler_view);
        NumberCategoryAdapter adapter = new NumberCategoryAdapter(getContext(), mNumbersList, listener);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);



        return view;
    }
}