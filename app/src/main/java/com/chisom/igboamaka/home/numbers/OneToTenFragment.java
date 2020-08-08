package com.chisom.igboamaka.home.numbers;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chisom.igboamaka.R;

import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("ALL")
public class OneToTenFragment extends Fragment {
    List<Numbers> mNumbersList;


    public OneToTenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one_to_ten, container, false);

        mNumbersList = new ArrayList<>();
        mNumbersList.add(new Numbers("0", "efu", Color.parseColor("#B13254"), R.raw.zero));
        mNumbersList.add(new Numbers("1", "otu",Color.parseColor("#FF5449"),R.raw.one));
        mNumbersList.add(new Numbers("2", "abụọ",Color.parseColor("#FF9249"),R.raw.two));

        mNumbersList.add(new Numbers("3", "atọ",Color.parseColor("#FF7349"),R.raw.three));
        mNumbersList.add(new Numbers("4", "anọ",Color.parseColor("#471437"),R.raw.four));
        mNumbersList.add(new Numbers("5", "ise",Color.parseColor("#B13254"),R.raw.five));

        mNumbersList.add(new Numbers("6", "isii",Color.parseColor("#B13254"),R.raw.six));
        mNumbersList.add(new Numbers("7", "asaa",Color.parseColor("#FF5449"),R.raw.seven));
        mNumbersList.add(new Numbers("8", "asato",Color.parseColor("#FF9249"),R.raw.eight));

        mNumbersList.add(new Numbers("9", "itoolu",Color.parseColor("#FF7349"),R.raw.nine));
        mNumbersList.add(new Numbers("10", "iri",Color.parseColor("#471437"),R.raw.iri));


        //noinspection unused
        OneToTenAdapter.RecyclerViewClickListener listener = new OneToTenAdapter.RecyclerViewClickListener() {
            @SuppressWarnings("unused")
            @Override
            public void onClick(View view, int position) {
                MediaPlayer mediaPlayer = MediaPlayer.create(view.getContext(), mNumbersList.get(position).getAudio());
                mediaPlayer.start();
            }
        };

        RecyclerView recyclerView = view.findViewById(R.id.numbers_one_to_ten_recycler_view);
        OneToTenAdapter adapter = new OneToTenAdapter(getContext(), mNumbersList, listener);

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        recyclerView.setAdapter(adapter);



        return view;
    }
}