package com.example.igboamaka.home.family;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;

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
        toolbar.setTitle("Animals");

        toolbar.setNavigationIcon(R.drawable.ic_baseline_keyboard_backspace_24);

        setSupportActionBar(toolbar);

        family = new ArrayList<>();

        family.add(new Family("nna", "Father", R.drawable.family_father, Color.parseColor("#B13254")));
        family.add(new Family("nne", "Mother", R.drawable.family_mother,Color.parseColor("#FF5449")));
        family.add(new Family("nwa nwanyị", "Daughter", R.drawable.family_daughter,Color.parseColor("#FF9249")));

        family.add(new Family("nnaochie", "GrandFather", R.drawable.family_grandfather,Color.parseColor("#FF7349")));
        family.add(new Family("nneochie", "GrandMother", R.drawable.family_grandmother,Color.parseColor("#471437")));
        family.add(new Family("nwanne nwoke nke okenye", "Elder Brother", R.drawable.family_older_brother,Color.parseColor("#B13254")));

        family.add(new Family("nwanne nwanyị nke okenye", "Elder Sister", R.drawable.family_older_sister,Color.parseColor("#FF9249")));
        family.add(new Family("nwa nwoke", "Son", R.drawable.family_son,Color.parseColor("#FF5449")));
        family.add(new Family("nwanne", "Younger Brother", R.drawable.family_younger_brother,Color.parseColor("#FF9249")));
        family.add(new Family("nwanne", "Younger Sister", R.drawable.family_younger_sister,Color.parseColor("#B13254")));


        RecyclerView recyclerView = findViewById(R.id.family_recycler_view);
        FamilyAdapter adapter = new FamilyAdapter(FamilyActivity.this, family);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}