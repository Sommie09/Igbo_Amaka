package com.example.igboamaka.home.alphabets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.example.igboamaka.R;
import com.example.igboamaka.home.sentences.SentenceCategoryAdapter;

import java.util.ArrayList;
import java.util.List;

public class AlphabetsActivity extends AppCompatActivity {
    List<Alphabets> alphabets;
    private AlphabetAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);

        Toolbar toolbar = findViewById(R.id.tool_bar);
        toolbar.setTitle("Alphabets");

        toolbar.setNavigationIcon(R.drawable.ic_baseline_keyboard_backspace_24);

        setSupportActionBar(toolbar);

        alphabets = new ArrayList<>();
        alphabets.add(new Alphabets("A", Color.parseColor("#B13254"), R.raw.number_two));
        alphabets.add(new Alphabets("B", Color.parseColor("#FF5449"), R.raw.number_two));
        alphabets.add(new Alphabets("CH", Color.parseColor("#FF9249"), R.raw.number_two));

        alphabets.add(new Alphabets("D", Color.parseColor("#FF7349"), R.raw.number_two));
        alphabets.add(new Alphabets("E", Color.parseColor("#471437"), R.raw.number_two));
        alphabets.add(new Alphabets("F", Color.parseColor("#B13254"), R.raw.number_two));

        alphabets.add(new Alphabets("G", Color.parseColor("#B13254"), R.raw.number_two));
        alphabets.add(new Alphabets("GB", Color.parseColor("#FF5449"), R.raw.number_two));
        alphabets.add(new Alphabets("GH", Color.parseColor("#FF9249"), R.raw.number_two));

        alphabets.add(new Alphabets("GW", Color.parseColor("#FF7349"), R.raw.number_two));
        alphabets.add(new Alphabets("H", Color.parseColor("#471437"), R.raw.number_two));
        alphabets.add(new Alphabets("I", Color.parseColor("#B13254"), R.raw.number_two));

        alphabets.add(new Alphabets("Ị", Color.parseColor("#B13254"), R.raw.number_two));
        alphabets.add(new Alphabets("J", Color.parseColor("#FF5449"), R.raw.number_two));
        alphabets.add(new Alphabets("K", Color.parseColor("#FF9249"), R.raw.number_two));

        alphabets.add(new Alphabets("KP", Color.parseColor("#FF7349"), R.raw.number_two));
        alphabets.add(new Alphabets("KW", Color.parseColor("#471437"), R.raw.number_two));
        alphabets.add(new Alphabets("L", Color.parseColor("#B13254"), R.raw.number_two));

        alphabets.add(new Alphabets("M", Color.parseColor("#B13254"), R.raw.number_two));
        alphabets.add(new Alphabets("N", Color.parseColor("#FF5449"), R.raw.number_two));
        alphabets.add(new Alphabets("Ñ", Color.parseColor("#FF9249"), R.raw.number_two));

        alphabets.add(new Alphabets("NW", Color.parseColor("#FF7349"), R.raw.number_two));
        alphabets.add(new Alphabets("NY", Color.parseColor("#471437"), R.raw.number_two));
        alphabets.add(new Alphabets("O", Color.parseColor("#B13254"), R.raw.number_two));

        alphabets.add(new Alphabets("Ọ", Color.parseColor("#B13254"), R.raw.number_two));
        alphabets.add(new Alphabets("P", Color.parseColor("#FF5449"), R.raw.number_two));
        alphabets.add(new Alphabets("R", Color.parseColor("#FF9249"), R.raw.number_two));

        alphabets.add(new Alphabets("S", Color.parseColor("#FF7349"), R.raw.number_two));
        alphabets.add(new Alphabets("SH", Color.parseColor("#471437"), R.raw.number_two));
        alphabets.add(new Alphabets("T", Color.parseColor("#B13254"), R.raw.number_two));

        alphabets.add(new Alphabets("U", Color.parseColor("#B13254"), R.raw.number_two));
        alphabets.add(new Alphabets("Ụ", Color.parseColor("#FF5449"), R.raw.number_two));
        alphabets.add(new Alphabets("V", Color.parseColor("#FF9249"), R.raw.number_two));

        alphabets.add(new Alphabets("W", Color.parseColor("#FF7349"), R.raw.number_two));
        alphabets.add(new Alphabets("Y", Color.parseColor("#471437"), R.raw.number_two));
        alphabets.add(new Alphabets("Z", Color.parseColor("#B13254"), R.raw.number_two));

        listener = new AlphabetAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                MediaPlayer mediaPlayer = MediaPlayer.create(view.getContext(), alphabets.get(position).getAudio());
                mediaPlayer.start();
            }
        };


        RecyclerView recyclerView = findViewById(R.id.alphabet_recycler_view);
        AlphabetAdapter adapter = new AlphabetAdapter(AlphabetsActivity.this, alphabets, listener);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(adapter);
    }
}