package com.example.igboamaka.home.family;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.example.igboamaka.R;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {
    List<Family> family;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        Toolbar toolbar = findViewById(R.id.tool_bar);
        toolbar.setTitle("Family");

        toolbar.setNavigationIcon(R.drawable.ic_baseline_keyboard_backspace_24);

        setSupportActionBar(toolbar);

        family = new ArrayList<>();

        family.add(new Family("Father", "nna", R.drawable.family_father, Color.parseColor("#B13254"), R.raw.father));
        family.add(new Family("Mother", "nne", R.drawable.family_mother,Color.parseColor("#FF5449"), R.raw.mother));
        family.add(new Family("Daughter", "nwa nwanyi", R.drawable.family_daughter,Color.parseColor("#FF9249"), R.raw.daughter));

        family.add(new Family("Grandfather", "nnaochie", R.drawable.family_grandfather,Color.parseColor("#FF7349"), R.raw.grandfather));
        family.add(new Family("Grandmother", "nneochie", R.drawable.family_grandmother,Color.parseColor("#471437"), R.raw.grandmother));
        family.add(new Family("Son", "nwa nwoke", R.drawable.family_son,Color.parseColor("#B13254"), R.raw.son));

        family.add(new Family("Brother", "nwanne nwoke", R.drawable.family_younger_brother,Color.parseColor("#FF9249"), R.raw.brother));
        family.add(new Family("Sister", "nwanne nwanyi", R.drawable.family_younger_sister,Color.parseColor("#FF5449"), R.raw.sister));

        FamilyAdapter.RecyclerViewClickListener listener = new FamilyAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                MediaPlayer mediaPlayer = MediaPlayer.create(view.getContext(), family.get(position).getAudio());
                mediaPlayer.start();
            }
        };



        RecyclerView recyclerView = findViewById(R.id.family_recycler_view);
        FamilyAdapter adapter = new FamilyAdapter(FamilyActivity.this, family, listener);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}