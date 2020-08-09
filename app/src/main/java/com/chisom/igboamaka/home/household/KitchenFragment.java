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
        houseHoldList.add(new HouseHold("kitchen", "ụlọ ano esi nri", Color.parseColor("#B13254"), R.raw.litchen));
        houseHoldList.add(new HouseHold("dining room", "ụlọ erimeri",Color.parseColor("#FF5449"), R.raw.dining));
        houseHoldList.add(new HouseHold("Water", "Mmiri",Color.parseColor("#FF9249"), R.raw.water));

        houseHoldList.add(new HouseHold("Stove", "Ekwu",Color.parseColor("#FF7349"), R.raw.stove));
        houseHoldList.add(new HouseHold("Pepper", "Ose",Color.parseColor("#471437"), R.raw.pepper));
        houseHoldList.add(new HouseHold("Spoon", "Ngazị/ngajị",Color.parseColor("#B13254"), R.raw.spoon));

        houseHoldList.add(new HouseHold("Fork", "Ngazị-eze",Color.parseColor("#B13254"), R.raw.fork));
        houseHoldList.add(new HouseHold("Mortar", "ikwe",Color.parseColor("#FF5449"), R.raw.mortar));
        houseHoldList.add(new HouseHold("Pestle", "aka Odu",Color.parseColor("#FF9249"), R.raw.pestle));

        houseHoldList.add(new HouseHold("Plate", "Efere",Color.parseColor("#FF7349"), R.raw.plate));
        houseHoldList.add(new HouseHold("Salt", "Nnu",Color.parseColor("#471437"), R.raw.salt));



        houseHoldList.add(new HouseHold("Knife", "mma", Color.parseColor("#B13254"), R.raw.knife));
        houseHoldList.add(new HouseHold("Food", "nri",Color.parseColor("#FF5449"), R.raw.food));
        houseHoldList.add(new HouseHold("Pot", "Ite",Color.parseColor("#471437"), R.raw.pot));

        houseHoldList.add(new HouseHold("Refrigerator", "Igbe-ntuoyi",Color.parseColor("#FF7349"), R.raw.fridge));
        houseHoldList.add(new HouseHold("Kolanut", "ọji",Color.parseColor("#471437"), R.raw.kolanut));
        houseHoldList.add(new HouseHold("Oil", "Mmanu",Color.parseColor("#B13254"), R.raw.oil));

        houseHoldList.add(new HouseHold("Fire", "ọkụ",Color.parseColor("#B13254"), R.raw.fire));
        houseHoldList.add(new HouseHold("Onion", "ịyobasị",Color.parseColor("#FF5449"), R.raw.onions));

        KitchenAdapter.RecyclerViewClickListener listener = new KitchenAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                MediaPlayer mediaPlayer = MediaPlayer.create(view.getContext(), houseHoldList.get(position).getAudio());
                mediaPlayer.start();
            }
        };

        RecyclerView recyclerView = view.findViewById(R.id.kitchen_recycler_view);
        KitchenAdapter adapter = new KitchenAdapter(getContext(), houseHoldList, listener);

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(adapter);



        return view;
    }
}