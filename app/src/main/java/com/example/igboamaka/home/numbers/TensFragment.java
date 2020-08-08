package com.example.igboamaka.home.numbers;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.igboamaka.R;

import java.util.ArrayList;
import java.util.List;


public class TensFragment extends Fragment {
    List<Numbers> mNumbersList;


    public TensFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tens, container, false);

        mNumbersList = new ArrayList<>();

        mNumbersList.add(new Numbers("10", "iri", Color.parseColor("#B13254"),R.raw.iri));
        mNumbersList.add(new Numbers("20", "iri abụọ",Color.parseColor("#FF5449"),R.raw.iri_abuo));
        mNumbersList.add(new Numbers("30", "iri atọ",Color.parseColor("#FF9249"),R.raw.thirty));

        mNumbersList.add(new Numbers("40", "iri anọ",Color.parseColor("#FF7349"),R.raw.forty));
        mNumbersList.add(new Numbers("50", "iri ise",Color.parseColor("#471437"),R.raw.fifty));
        mNumbersList.add(new Numbers("60", "iri isii", Color.parseColor("#B13254"),R.raw.sixty));

        mNumbersList.add(new Numbers("70", "iri asaa",Color.parseColor("#B13254"),R.raw.seventy));
        mNumbersList.add(new Numbers("80", "iri asato",Color.parseColor("#FF5449"),R.raw.iri_asato));
        mNumbersList.add(new Numbers("90", "iri itoolu", Color.parseColor("#FF9249"),R.raw.iri_itolu));

        TensAdapter.RecyclerViewClickListener listener = new TensAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                MediaPlayer mediaPlayer = MediaPlayer.create(view.getContext(), mNumbersList.get(position).getAudio());
                mediaPlayer.start();
            }
        };

        RecyclerView recyclerView = view.findViewById(R.id.tens_recycler_view);
        TensAdapter adapter = new TensAdapter(getContext(), mNumbersList, listener);

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        recyclerView.setAdapter(adapter);

        return view;
    }
}