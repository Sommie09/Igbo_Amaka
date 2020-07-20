package com.example.igboamaka.numbers;

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


public class ElevenToTwentyFragment extends Fragment {
    List<Numbers> mNumbersList;


    public ElevenToTwentyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one_to_ten, container, false);

        mNumbersList = new ArrayList<>();
        mNumbersList.add(new Numbers("11", "iri na otu", Color.parseColor("#E65100")));
        mNumbersList.add(new Numbers("12", "iri na abụọ",Color.parseColor("#e6c400")));
        mNumbersList.add(new Numbers("13", "iri na atọ",Color.parseColor("#e60022")));
        mNumbersList.add(new Numbers("14", "iri na anọ",Color.parseColor("#E65100")));
        mNumbersList.add(new Numbers("15", "iri na ise",Color.parseColor("#e6c400")));
        mNumbersList.add(new Numbers("16", "iri na isii",Color.parseColor("#E65100")));
        mNumbersList.add(new Numbers("17", "iri na asaa",Color.parseColor("#e60022")));
        mNumbersList.add(new Numbers("18", "iri na asato",Color.parseColor("#E65100")));
        mNumbersList.add(new Numbers("19", "iri na itoolu",Color.parseColor("#e6c400")));
        mNumbersList.add(new Numbers("20", "iri abụọ",Color.parseColor("#E65100")));
        mNumbersList.add(new Numbers("21", "iri abụọ na otu",Color.parseColor("#e60022")));
        mNumbersList.add(new Numbers("22", "iri abụọ na abụọ",Color.parseColor("#E65100")));
        mNumbersList.add(new Numbers("23", "iri abụọ na atọ",Color.parseColor("#e6c400")));
        mNumbersList.add(new Numbers("24", "iri abụọ na anọ",Color.parseColor("#e60022")));
        mNumbersList.add(new Numbers("25", "iri abụọ na ise",Color.parseColor("#E65100")));
        mNumbersList.add(new Numbers("26", "iri abụọ na isii",Color.parseColor("#e6c400")));
        mNumbersList.add(new Numbers("27", "iri abụọ na asaa",Color.parseColor("#e60022")));
        mNumbersList.add(new Numbers("28", "iri abụọ na asato",Color.parseColor("#E65100")));
        mNumbersList.add(new Numbers("29", "iri abụọ na itoolu",Color.parseColor("#e6c400")));
        mNumbersList.add(new Numbers("30", "iri atọ",Color.parseColor("#E65100")));



        RecyclerView recyclerView = view.findViewById(R.id.numbers_recycler_view);
        NumberCategoryAdapter adapter = new NumberCategoryAdapter(getContext(), mNumbersList);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);



        return view;
    }
}