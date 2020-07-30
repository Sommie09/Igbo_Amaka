package com.example.igboamaka.household;

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


public class KitchenFragment extends Fragment {
    List<HouseHold> houseHoldList;


    public KitchenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_kitchen, container, false);

        houseHoldList = new ArrayList<>();
        houseHoldList.add(new HouseHold("kitchen", "ụlọ ano esi ri", Color.parseColor("#B13254")));
        houseHoldList.add(new HouseHold("dining room", "ụlọ erimeri",Color.parseColor("#FF5449")));
        houseHoldList.add(new HouseHold("Water", "Mmiri",Color.parseColor("#FF9249")));

        houseHoldList.add(new HouseHold("Stove", "Ekwu",Color.parseColor("#FF7349")));
        houseHoldList.add(new HouseHold("Pepper", "Ose",Color.parseColor("#471437")));
        houseHoldList.add(new HouseHold("Spoon", "Ngazị/ngajị",Color.parseColor("#B13254")));

        houseHoldList.add(new HouseHold("Fork", "Ngazị-eze",Color.parseColor("#B13254")));
        houseHoldList.add(new HouseHold("Mortar", "ikwe",Color.parseColor("#FF5449")));
        houseHoldList.add(new HouseHold("Pestle", "aka Odu",Color.parseColor("#FF9249")));

        houseHoldList.add(new HouseHold("Plates", "Efere",Color.parseColor("#FF7349")));
        houseHoldList.add(new HouseHold("Salt", "Nnu",Color.parseColor("#471437")));



        houseHoldList.add(new HouseHold("Knife", "mma", Color.parseColor("#B13254")));
        houseHoldList.add(new HouseHold("Food", "Nri",Color.parseColor("#FF5449")));
        houseHoldList.add(new HouseHold("Pot", "Ite",Color.parseColor("#FF9249")));

        houseHoldList.add(new HouseHold("Refrigerator", "Igbe-ntuoyi",Color.parseColor("#FF7349")));
        houseHoldList.add(new HouseHold("Kolanut", "ọji",Color.parseColor("#471437")));
        houseHoldList.add(new HouseHold("Oil", "Mmanu",Color.parseColor("#B13254")));

        houseHoldList.add(new HouseHold("Fire", "ọkụ",Color.parseColor("#B13254")));
        houseHoldList.add(new HouseHold("Onion", "ịyobasị",Color.parseColor("#FF5449")));

        RecyclerView recyclerView = view.findViewById(R.id.house_hold_recycler_view);
        HouseholdCategoryAdapter adapter = new HouseholdCategoryAdapter(getContext(), houseHoldList);

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(adapter);



        return view;
    }
}