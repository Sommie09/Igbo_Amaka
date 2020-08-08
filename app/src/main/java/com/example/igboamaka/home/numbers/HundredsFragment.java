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


public class HundredsFragment extends Fragment {
    List<Numbers> mNumbersList;
    private HundredsAdapter.RecyclerViewClickListener listener;


    public HundredsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hundred, container, false);

        mNumbersList = new ArrayList<>();

        mNumbersList.add(new Numbers("100", "otu nnari", Color.parseColor("#B13254"),R.raw.number_two));
        mNumbersList.add(new Numbers("200", "nari abụọ",Color.parseColor("#FF5449"),R.raw.number_two));
        mNumbersList.add(new Numbers("300", "nari atọ",Color.parseColor("#FF9249"),R.raw.number_two));

        mNumbersList.add(new Numbers("400", "nari anọ",Color.parseColor("#FF7349"),R.raw.number_two));
        mNumbersList.add(new Numbers("500", "nari ise",Color.parseColor("#471437"),R.raw.number_two));
        mNumbersList.add(new Numbers("600", "nari isii",Color.parseColor("#B13254"),R.raw.number_two));

        mNumbersList.add(new Numbers("700", "nari  asaa",Color.parseColor("#FF9249"),R.raw.number_two));
        mNumbersList.add(new Numbers("800", "nari asato",Color.parseColor("#FF5449"),R.raw.number_two));
        mNumbersList.add(new Numbers("900", "nari itoolu",Color.parseColor("#FF9249"),R.raw.number_two));

        mNumbersList.add(new Numbers("1000", "otu puku",Color.parseColor("#FF7349"),R.raw.number_two));
        mNumbersList.add(new Numbers("100,000", "puku nari",Color.parseColor("#471437"),R.raw.number_two));
        mNumbersList.add(new Numbers("100,000,000", "otu nde",Color.parseColor("#B13254"),R.raw.number_two));

        listener = new HundredsAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                MediaPlayer mediaPlayer = MediaPlayer.create(view.getContext(), mNumbersList.get(position).getAudio());
                mediaPlayer.start();
            }
        };


        RecyclerView recyclerView = view.findViewById(R.id.hundred_recycler_view);
        HundredsAdapter adapter = new HundredsAdapter(getContext(), mNumbersList, listener);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}