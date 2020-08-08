package com.chisom.igboamaka.funfacts.names;

import android.graphics.Color;
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

public class GirlsFragment extends Fragment {
    List<Names> names;


    public GirlsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_girls, container, false);

        names = new ArrayList<>();

        names.add(new Names("Adaeze", "Daughter of a king/ princess", Color.parseColor("#B13254")));
        names.add(new Names("Adaobi", "First daughter in the family",Color.parseColor("#FF5449")));
        names.add(new Names("Adaora", "The peoples daughter",Color.parseColor("#FF9249")));

        names.add(new Names("Amaka", "Beautiful / Good",Color.parseColor("#FF7349")));
        names.add(new Names("Amarachi", "Mercy / Mercy of God",Color.parseColor("#471437")));
        names.add(new Names("Chetachi", "Remember God", Color.parseColor("#B13254")));

        names.add(new Names("Chiamaka", "God is beautiful",Color.parseColor("#FF5449")));
        names.add(new Names("Chimamanda", "God will not fail",Color.parseColor("#FF9249")));

        names.add(new Names("Chidinma", "God is good",Color.parseColor("#FF7349")));
        names.add(new Names("Chikaodili", "It's all up to God",Color.parseColor("#471437")));
        names.add(new Names("Chinelo", "In God's thought", Color.parseColor("#B13254")));

        names.add(new Names("Chinenye", "God gives",Color.parseColor("#B13254")));
        names.add(new Names("Chinwendu", "Life belongs to God",Color.parseColor("#FF5449")));
        names.add(new Names("Chioma", "Good God", Color.parseColor("#FF9249")));


        names.add(new Names("Chisom", "God is with me",Color.parseColor("#FF5449")));
        names.add(new Names("Ginika", "What is greater",Color.parseColor("#FF9249")));

        names.add(new Names("Ifechukwu", "Light of God",Color.parseColor("#FF7349")));
        names.add(new Names("Ifeoma", "A good thing",Color.parseColor("#471437")));
        names.add(new Names("Ifunanya", "Love", Color.parseColor("#B13254")));

        names.add(new Names("Ijeoma", "Good journey",Color.parseColor("#FF5449")));
        names.add(new Names("Isioma", "Good Luck",Color.parseColor("#FF9249")));

        names.add(new Names("Kairaluchukwu", "Let's choose God",Color.parseColor("#FF7349")));
        names.add(new Names("Ndidi", "Patience",Color.parseColor("#471437")));
        names.add(new Names("Ngozi", "Blessing", Color.parseColor("#B13254")));

        names.add(new Names("Nnenna", "Her fathers' mother",Color.parseColor("#B13254")));
        names.add(new Names("Nneoma", "Good mother",Color.parseColor("#FF5449")));
        names.add(new Names("Obianuju", "Born/ Arrived in the midst of plenty", Color.parseColor("#FF9249")));

        names.add(new Names("Ogechukwu", "Gods' time is the best",Color.parseColor("#FF7349")));
        names.add(new Names("Sochikaima", "It's only God we know",Color.parseColor("#471437")));
        names.add(new Names("Zirachi", "Send God to do something and he will", Color.parseColor("#B13254")));



        RecyclerView recyclerView = view.findViewById(R.id.girls_recycler_view);
        NamesCategoryAdapter adapter = new NamesCategoryAdapter(getContext(), names);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}