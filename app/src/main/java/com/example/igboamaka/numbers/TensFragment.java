package com.example.igboamaka.numbers;

import android.graphics.Color;
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
        View view = inflater.inflate(R.layout.fragment_one_to_ten, container, false);

        mNumbersList = new ArrayList<>();
        mNumbersList.add(new Numbers("10", "iri", Color.parseColor("#E65100")));
        mNumbersList.add(new Numbers("20", "iri abụọ",Color.parseColor("#e60022")));
        mNumbersList.add(new Numbers("30", "iri atọ",Color.parseColor("#e6c400")));
        mNumbersList.add(new Numbers("40", "iri anọ",Color.parseColor("#e60022")));
        mNumbersList.add(new Numbers("50", "iri ise",Color.parseColor("#e6c400")));
        mNumbersList.add(new Numbers("60", "iri isii", Color.parseColor("#E65100")));
        mNumbersList.add(new Numbers("70", "iri asaa",Color.parseColor("#e6c400")));
        mNumbersList.add(new Numbers("80", "iri asato",Color.parseColor("#E65100")));
        mNumbersList.add(new Numbers("90", "iri itoolu", Color.parseColor("#e6c400")));

        RecyclerView recyclerView = view.findViewById(R.id.numbers_recycler_view);
        NumberCategoryAdapter adapter = new NumberCategoryAdapter(getContext(), mNumbersList);

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        recyclerView.setAdapter(adapter);

        return view;
    }
}