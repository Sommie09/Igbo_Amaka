package com.example.igboamaka.home.colors;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;

import com.example.igboamaka.R;

import java.util.ArrayList;
import java.util.List;

public class ColoursActivity extends AppCompatActivity {
    List<Colours> colours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colours);

        Toolbar toolbar = findViewById(R.id.tool_bar);
        toolbar.setTitle("Colours");

        toolbar.setNavigationIcon(R.drawable.ic_baseline_keyboard_backspace_24);

        setSupportActionBar(toolbar);

        colours = new ArrayList<>();
        colours.add(new Colours("Red", "ọbara ọbara", Color.RED,Color.WHITE));
        colours.add(new Colours("Yellow", "edo", Color.YELLOW,Color.WHITE));
        colours.add(new Colours("Green", "ndụ-ndụ", Color.GREEN,Color.WHITE));
        colours.add(new Colours("Blue", "amaloji", Color.BLUE,Color.WHITE));
        colours.add(new Colours("Brown", " uri", Color.parseColor("#8B4513"),Color.WHITE));
        colours.add(new Colours("Grey", " ntụ-ntụ", Color.GRAY,Color.WHITE));
        colours.add(new Colours("Black", "oji", Color.BLACK,Color.WHITE));
        colours.add(new Colours("White", "ọcha", Color.WHITE, Color.BLACK));
        colours.add(new Colours("Orange", "oroma", Color.parseColor("#E65100"),Color.WHITE));
        colours.add(new Colours("Purple", "ododo", Color.parseColor("#800080"),Color.WHITE));
        colours.add(new Colours("Gold", "Olaedo", Color.parseColor("#FFD700"),Color.WHITE));
        colours.add(new Colours("Pink", "Uhie ocha", Color.parseColor("#FFC0CB"),Color.WHITE));
        colours.add(new Colours("Silver", "Olaocha", Color.parseColor("#C0C0C0"),Color.WHITE));


        RecyclerView recyclerView = findViewById(R.id.colours_recycler_view);
        ColoursAdapter adapter = new ColoursAdapter(ColoursActivity.this, colours);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}