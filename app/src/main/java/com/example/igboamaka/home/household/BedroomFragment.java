package com.example.igboamaka.home.household;

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


public class BedroomFragment extends Fragment {
    List<HouseHold> houseHoldList;


    public BedroomFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bedroom, container, false);

        houseHoldList = new ArrayList<>();
        houseHoldList.add(new HouseHold("door", "ụzọ", Color.parseColor("#B13254")));
        houseHoldList.add(new HouseHold("window", "ụzọ oyi",Color.parseColor("#FF5449")));
        houseHoldList.add(new HouseHold("bag", "akpa",Color.parseColor("#FF9249")));

        houseHoldList.add(new HouseHold("basket", "nkata",Color.parseColor("#FF7349")));
        houseHoldList.add(new HouseHold("bed", "akwa",Color.parseColor("#471437")));
        houseHoldList.add(new HouseHold("box", "igbe",Color.parseColor("#B13254")));

        houseHoldList.add(new HouseHold("chair", "oche",Color.parseColor("#B13254")));
        houseHoldList.add(new HouseHold("key", "otugwa",Color.parseColor("#FF5449")));
        houseHoldList.add(new HouseHold("mirror", "enyo",Color.parseColor("#FF9249")));

        houseHoldList.add(new HouseHold("pillow", "mpalisi",Color.parseColor("#FF7349")));
        houseHoldList.add(new HouseHold("table", "tebelu",Color.parseColor("#471437")));



        houseHoldList.add(new HouseHold("television", "Onyonyo", Color.parseColor("#B13254")));
        houseHoldList.add(new HouseHold("Book", "Akwukwo",Color.parseColor("#FF5449")));
        houseHoldList.add(new HouseHold("Radio", "Akpati-okwu",Color.parseColor("#FF9249")));

        houseHoldList.add(new HouseHold("Clothes", "Uwe",Color.parseColor("#FF7349")));
        houseHoldList.add(new HouseHold("Photographs", "Onyonyo/foto",Color.parseColor("#471437")));
        houseHoldList.add(new HouseHold("Towel", "Akwa-mmiri",Color.parseColor("#B13254")));

        houseHoldList.add(new HouseHold("Air Conditioning", "Ntuoyi",Color.parseColor("#B13254")));
        houseHoldList.add(new HouseHold("Broom", "Azịza",Color.parseColor("#FF5449")));
        houseHoldList.add(new HouseHold("Shoe", "Akpukpo-ukwu",Color.parseColor("#FF9249")));

        houseHoldList.add(new HouseHold("Electric Fan", "Igwe-ikuku",Color.parseColor("#FF7349")));

        RecyclerView recyclerView = view.findViewById(R.id.house_hold_recycler_view);
        HouseholdCategoryAdapter adapter = new HouseholdCategoryAdapter(getContext(), houseHoldList);

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(adapter);


        return view;
    }
}