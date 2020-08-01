package com.example.igboamaka.funfacts.names;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.igboamaka.R;
import com.example.igboamaka.home.sentences.SentenceCategoryAdapter;
import com.example.igboamaka.home.sentences.Sentences;

import java.util.ArrayList;
import java.util.List;


public class BoysFragment extends Fragment {
    List<Names> names;

    public BoysFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_boys, container, false);

        names = new ArrayList<>();

        names.add(new Names("Akachi", "God’s hand", Color.parseColor("#B13254")));
        names.add(new Names("Arinze", "By the grace of God",Color.parseColor("#FF5449")));
        names.add(new Names("Chetachi", "Remember God",Color.parseColor("#FF9249")));

        names.add(new Names("Chibuike", "God is strength.",Color.parseColor("#FF7349")));
        names.add(new Names("Chibuzor", "God leads",Color.parseColor("#471437")));
        names.add(new Names("Chidera", "Destiny cannot be changed", Color.parseColor("#B13254")));

        names.add(new Names("Chidubem", "Let God lead me",Color.parseColor("#FF5449")));
        names.add(new Names("Chinedu", "God Leads",Color.parseColor("#FF9249")));

        names.add(new Names("Chinonso", "God is near",Color.parseColor("#FF7349")));
        names.add(new Names("Chukwudi", "There is God",Color.parseColor("#471437")));
        names.add(new Names("Chidike", "God is strong", Color.parseColor("#B13254")));

        names.add(new Names("Chimdi", "My God is",Color.parseColor("#B13254")));
        names.add(new Names("Chukwuka", "God is bigger",Color.parseColor("#FF5449")));
        names.add(new Names("Enyinna", "His fathers friend", Color.parseColor("#FF9249")));


        names.add(new Names("Ifeanyichukwu", "Nothing is too big for God",Color.parseColor("#FF5449")));
        names.add(new Names("Ifesinachi", "Sent from God",Color.parseColor("#FF9249")));

        names.add(new Names("Ikechukwu", "The strength of God",Color.parseColor("#FF7349")));
        names.add(new Names("Jidenna", "Hold on to God/ Father",Color.parseColor("#471437")));
        names.add(new Names("Kelechi", "Praise God", Color.parseColor("#B13254")));

        names.add(new Names("Kosisochi", "As it pleases God",Color.parseColor("#FF5449")));
        names.add(new Names("Lotachi", "Remember God",Color.parseColor("#FF9249")));

        names.add(new Names("Munachimso", "Walking with the Lord",Color.parseColor("#FF7349")));
        names.add(new Names("Nwachukwu", "Child of God",Color.parseColor("#471437")));
        names.add(new Names("Nnamdi", "My God is alive/ My father lives", Color.parseColor("#B13254")));

        names.add(new Names("Obinna", "The heart/ will of the father",Color.parseColor("#B13254")));
        names.add(new Names("Okechukwu", "Share from God",Color.parseColor("#FF5449")));
        names.add(new Names("Osinachi", "From God", Color.parseColor("#FF9249")));

        names.add(new Names("Tobenna", "Praise the father",Color.parseColor("#FF7349")));
        names.add(new Names("Uchenna", "The will of the father",Color.parseColor("#471437")));
        names.add(new Names("Zimuzo", "Show me the way", Color.parseColor("#B13254")));



        RecyclerView recyclerView = view.findViewById(R.id.boys_recycler_view);
        NamesCategoryAdapter adapter = new NamesCategoryAdapter(getContext(), names);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}