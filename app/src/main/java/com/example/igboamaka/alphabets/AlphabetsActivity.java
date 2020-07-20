package com.example.igboamaka.alphabets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;

import com.example.igboamaka.R;
import com.example.igboamaka.colors.Colours;
import com.example.igboamaka.colors.ColoursActivity;
import com.example.igboamaka.colors.ColoursAdapter;

import java.util.ArrayList;
import java.util.List;

public class AlphabetsActivity extends AppCompatActivity {
    List<Alphabets> alphabets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);

        Toolbar toolbar = findViewById(R.id.tool_bar);
        toolbar.setTitle("Alphabets");

        toolbar.setNavigationIcon(R.drawable.ic_baseline_keyboard_backspace_24);

        setSupportActionBar(toolbar);

        alphabets = new ArrayList<>();
        alphabets.add(new Alphabets("A", Color.parseColor("#E65100")));
        alphabets.add(new Alphabets("B", Color.parseColor("#daa520")));
        alphabets.add(new Alphabets("CH", Color.parseColor("#e60022")));

        alphabets.add(new Alphabets("D", Color.parseColor("#e60022")));
        alphabets.add(new Alphabets("E", Color.parseColor("#E65100")));
        alphabets.add(new Alphabets("F", Color.parseColor("#daa520")));

        alphabets.add(new Alphabets("G", Color.parseColor("#E65100")));
        alphabets.add(new Alphabets("GB", Color.parseColor("#daa520")));
        alphabets.add(new Alphabets("GH", Color.parseColor("#e60022")));

        alphabets.add(new Alphabets("GW", Color.parseColor("#e60022")));
        alphabets.add(new Alphabets("H", Color.parseColor("#E65100")));
        alphabets.add(new Alphabets("I", Color.parseColor("#daa520")));

        alphabets.add(new Alphabets("Ị", Color.parseColor("#E65100")));
        alphabets.add(new Alphabets("J", Color.parseColor("#daa520")));
        alphabets.add(new Alphabets("K", Color.parseColor("#e60022")));

        alphabets.add(new Alphabets("KP", Color.parseColor("#e60022")));
        alphabets.add(new Alphabets("KW", Color.parseColor("#E65100")));
        alphabets.add(new Alphabets("L", Color.parseColor("#daa520")));

        alphabets.add(new Alphabets("M", Color.parseColor("#E65100")));
        alphabets.add(new Alphabets("N", Color.parseColor("#daa520")));
        alphabets.add(new Alphabets("Ñ", Color.parseColor("#e60022")));

        alphabets.add(new Alphabets("NW", Color.parseColor("#e60022")));
        alphabets.add(new Alphabets("NY", Color.parseColor("#E65100")));
        alphabets.add(new Alphabets("O", Color.parseColor("#daa520")));

        alphabets.add(new Alphabets("Ọ", Color.parseColor("#E65100")));
        alphabets.add(new Alphabets("P", Color.parseColor("#daa520")));
        alphabets.add(new Alphabets("R", Color.parseColor("#e60022")));

        alphabets.add(new Alphabets("S", Color.parseColor("#e60022")));
        alphabets.add(new Alphabets("SH", Color.parseColor("#E65100")));
        alphabets.add(new Alphabets("T", Color.parseColor("#daa520")));

        alphabets.add(new Alphabets("U", Color.parseColor("#E65100")));
        alphabets.add(new Alphabets("Ụ", Color.parseColor("#daa520")));
        alphabets.add(new Alphabets("V", Color.parseColor("#e60022")));

        alphabets.add(new Alphabets("W", Color.parseColor("#e60022")));
        alphabets.add(new Alphabets("Y", Color.parseColor("#E65100")));
        alphabets.add(new Alphabets("Z", Color.parseColor("#daa520")));


        RecyclerView recyclerView = findViewById(R.id.alphabet_recycler_view);
        AlphabetAdapter adapter = new AlphabetAdapter(AlphabetsActivity.this, alphabets);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(adapter);
    }
}