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
import com.example.igboamaka.home.sentences.SentenceCategoryAdapter;
import com.example.igboamaka.quiz.family.FamilyQuizAdapter;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {
    List<Family> family;
    private FamilyAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        Toolbar toolbar = findViewById(R.id.tool_bar);
        toolbar.setTitle("Family");

        toolbar.setNavigationIcon(R.drawable.ic_baseline_keyboard_backspace_24);

        setSupportActionBar(toolbar);

        family = new ArrayList<>();

        family.add(new Family("nna", "Father", R.drawable.family_father, Color.parseColor("#B13254"), R.raw.number_two));
        family.add(new Family("nne", "Mother", R.drawable.family_mother,Color.parseColor("#FF5449"), R.raw.number_two));
        family.add(new Family("nwa nwanyị", "Daughter", R.drawable.family_daughter,Color.parseColor("#FF9249"), R.raw.number_two));

        family.add(new Family("nnaochie", "GrandFather", R.drawable.family_grandfather,Color.parseColor("#FF7349"), R.raw.number_two));
        family.add(new Family("nneochie", "GrandMother", R.drawable.family_grandmother,Color.parseColor("#471437"), R.raw.number_two));
        family.add(new Family("nwanne nwoke nke okenye", "Elder Brother", R.drawable.family_older_brother,Color.parseColor("#B13254"), R.raw.number_two));

        family.add(new Family("nwanne nwanyị nke okenye", "Elder Sister", R.drawable.family_older_sister,Color.parseColor("#FF9249"), R.raw.number_two));
        family.add(new Family("nwa nwoke", "Son", R.drawable.family_son,Color.parseColor("#FF5449"), R.raw.number_two));
        family.add(new Family("nwanne", "Younger Brother", R.drawable.family_younger_brother,Color.parseColor("#FF9249"), R.raw.number_two));
        family.add(new Family("nwanne", "Younger Sister", R.drawable.family_younger_sister,Color.parseColor("#B13254"), R.raw.number_two));

        listener = new FamilyAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                MediaPlayer mediaPlayer = MediaPlayer.create(view.getContext(), family.get(position).getAudio());
                mediaPlayer.start();
            }
        };



        RecyclerView recyclerView = findViewById(R.id.family_recycler_view);
        FamilyAdapter adapter = new FamilyAdapter(FamilyActivity.this, family,listener);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}