package com.chisom.igboamaka.home.household;

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
        houseHoldList.add(new HouseHold("door", "ụzọ", Color.parseColor("#B13254"), R.raw.door));
        houseHoldList.add(new HouseHold("window", "ụzọ oyi",Color.parseColor("#FF5449"), R.raw.window));
        houseHoldList.add(new HouseHold("bag", "akpa",Color.parseColor("#FF9249"), R.raw.bag));

        houseHoldList.add(new HouseHold("basket", "nkata",Color.parseColor("#FF7349"), R.raw.basket));
        houseHoldList.add(new HouseHold("bed", "akwa",Color.parseColor("#471437"), R.raw.bed));
        houseHoldList.add(new HouseHold("box", "igbe",Color.parseColor("#B13254"), R.raw.box));

        houseHoldList.add(new HouseHold("chair", "oche",Color.parseColor("#B13254"), R.raw.chair));
        houseHoldList.add(new HouseHold("key", "otugwa",Color.parseColor("#FF5449"), R.raw.key));
        houseHoldList.add(new HouseHold("mirror", "enyo",Color.parseColor("#FF9249"), R.raw.mirror));

        houseHoldList.add(new HouseHold("pillow", "mpalisi",Color.parseColor("#FF7349"), R.raw.pillow));
        houseHoldList.add(new HouseHold("table", "tebelu",Color.parseColor("#471437"), R.raw.table));


        houseHoldList.add(new HouseHold("television", "Onyonyo", Color.parseColor("#B13254"), R.raw.tv));
        houseHoldList.add(new HouseHold("Book", "Akwukwo",Color.parseColor("#FF5449"), R.raw.book));
        houseHoldList.add(new HouseHold("Radio", "Akpati-okwu",Color.parseColor("#FF9249"), R.raw.radio));

        houseHoldList.add(new HouseHold("Clothes", "Uwe",Color.parseColor("#FF7349"), R.raw.cloths));
        houseHoldList.add(new HouseHold("Photographs", "Onyonyo/foto",Color.parseColor("#471437"), R.raw.photographs));
        houseHoldList.add(new HouseHold("Towel", "Akwa-mmiri",Color.parseColor("#B13254"), R.raw.towel));

        houseHoldList.add(new HouseHold("Air Conditioning", "Ntuoyi",Color.parseColor("#B13254"), R.raw.ac));
        houseHoldList.add(new HouseHold("Broom", "Azịza",Color.parseColor("#FF5449"), R.raw.broom));
        houseHoldList.add(new HouseHold("Shoe", "Akpukpo-ukwu",Color.parseColor("#FF9249"), R.raw.shoe));

        houseHoldList.add(new HouseHold("Electric Fan", "Igwe-ikuku",Color.parseColor("#FF7349"), R.raw.electric_fan));

        BedroomAdapter.RecyclerViewClickListener listener = new BedroomAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                MediaPlayer mediaPlayer = MediaPlayer.create(view.getContext(), houseHoldList.get(position).getAudio());
                mediaPlayer.start();
            }
        };


        RecyclerView recyclerView = view.findViewById(R.id.bedroom_recycler_view);
        BedroomAdapter adapter = new BedroomAdapter(getContext(), houseHoldList, listener);

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(adapter);


        return view;
    }
}