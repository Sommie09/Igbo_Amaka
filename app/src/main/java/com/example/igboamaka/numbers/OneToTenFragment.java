package com.example.igboamaka.numbers;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.igboamaka.R;

import java.util.ArrayList;
import java.util.List;


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
        mNumbersList.add(new Numbers("0", "efu", Color.parseColor("#e6c400")));
        mNumbersList.add(new Numbers("1", "otu",Color.parseColor("#e60022")));
        mNumbersList.add(new Numbers("2", "abụọ",Color.parseColor("#E65100")));
        mNumbersList.add(new Numbers("3", "atọ",Color.parseColor("#e60022")));
        mNumbersList.add(new Numbers("4", "anọ",Color.parseColor("#e6c400")));
        mNumbersList.add(new Numbers("5", "ise",Color.parseColor("#E65100")));
        mNumbersList.add(new Numbers("6", "isii",Color.parseColor("#e6c400")));
        mNumbersList.add(new Numbers("7", "asaa",Color.parseColor("#e60022")));
        mNumbersList.add(new Numbers("8", "asato",Color.parseColor("#E65100")));
        mNumbersList.add(new Numbers("9", "itoolu",Color.parseColor("#e60022")));
        mNumbersList.add(new Numbers("10", "iri",Color.parseColor("#E65100")));

        RecyclerView recyclerView = view.findViewById(R.id.numbers_recycler_view);
        NumberCategoryAdapter adapter = new NumberCategoryAdapter(getContext(), mNumbersList);

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        recyclerView.setAdapter(adapter);



        return view;
    }
}