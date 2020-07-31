package com.example.igboamaka.home.numbers;

import android.graphics.Color;
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


    public HundredsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one_to_ten, container, false);

        mNumbersList = new ArrayList<>();

        mNumbersList.add(new Numbers("100", "otu nnari", Color.parseColor("#B13254")));
        mNumbersList.add(new Numbers("200", "nari abụọ",Color.parseColor("#FF5449")));
        mNumbersList.add(new Numbers("300", "nari atọ",Color.parseColor("#FF9249")));

        mNumbersList.add(new Numbers("400", "nari anọ",Color.parseColor("#FF7349")));
        mNumbersList.add(new Numbers("500", "nari ise",Color.parseColor("#471437")));
        mNumbersList.add(new Numbers("600", "nari isii",Color.parseColor("#B13254")));

        mNumbersList.add(new Numbers("700", "nari  asaa",Color.parseColor("#FF9249")));
        mNumbersList.add(new Numbers("800", "nari asato",Color.parseColor("#FF5449")));
        mNumbersList.add(new Numbers("900", "nari itoolu",Color.parseColor("#FF9249")));

        mNumbersList.add(new Numbers("1000", "otu puku",Color.parseColor("#FF7349")));
        mNumbersList.add(new Numbers("100,000", "puku nari",Color.parseColor("#471437")));
        mNumbersList.add(new Numbers("100,000,000", "otu nde",Color.parseColor("#B13254")));

        mNumbersList.add(new Numbers("100,000,000,000", "otu ijeri",Color.parseColor("#FF9249")));

        RecyclerView recyclerView = view.findViewById(R.id.numbers_recycler_view);
        NumberCategoryAdapter adapter = new NumberCategoryAdapter(getContext(), mNumbersList);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}