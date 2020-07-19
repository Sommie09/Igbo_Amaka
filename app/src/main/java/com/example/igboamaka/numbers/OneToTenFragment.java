package com.example.igboamaka.numbers;

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
        mNumbersList.add(new Numbers("1", "ótù"));
        mNumbersList.add(new Numbers("2", "ótù"));
        mNumbersList.add(new Numbers("3", "ótù"));
        mNumbersList.add(new Numbers("4", "ótù"));
        mNumbersList.add(new Numbers("5", "ótù"));
        mNumbersList.add(new Numbers("6", "ótù"));
        mNumbersList.add(new Numbers("7", "ótù"));
        mNumbersList.add(new Numbers("8", "ótù"));
        mNumbersList.add(new Numbers("9", "ótù"));
        mNumbersList.add(new Numbers("10", "ótù"));

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.numbers_recycler_view);
        OneToTenAdapter adapter = new OneToTenAdapter(getContext(), mNumbersList);

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        recyclerView.setAdapter(adapter);



        return view;
    }
}