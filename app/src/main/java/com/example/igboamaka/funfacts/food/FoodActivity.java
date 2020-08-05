package com.example.igboamaka.funfacts.food;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;

import com.example.igboamaka.R;
import com.example.igboamaka.home.family.Family;
import com.example.igboamaka.home.family.FamilyActivity;
import com.example.igboamaka.home.family.FamilyAdapter;

import java.util.ArrayList;
import java.util.List;

public class FoodActivity extends AppCompatActivity {
    List<Food> foods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        Toolbar toolbar = findViewById(R.id.tool_bar);
        toolbar.setTitle("Igbo Food");


        setSupportActionBar(toolbar);

        foods = new ArrayList<>();

        foods.add(new Food("ABACHA",
                R.drawable.abacha,
                Color.parseColor("#B13254")));

        foods.add(new Food("UKWA",
                R.drawable.ukwa,
                Color.parseColor("#471437")));

        foods.add(new Food("NKWOBI",
                R.drawable.nkwobi,
                Color.parseColor("#FF5449")));

        foods.add(new Food("OFE ONUGBU",
                R.drawable.bitterleaf,
                Color.parseColor("#FF7349")));

        foods.add(new Food("OFE NSALA",
                R.drawable.nsala,
                Color.parseColor("#FF9249")));

        foods.add(new Food("OFE OGBONO",
                R.drawable.ogbono,
                Color.parseColor("#B13254")));

        foods.add(new Food("OFE OHA",
                R.drawable.oha,
                Color.parseColor("#471437")));

        foods.add(new Food("OKPA",
                R.drawable.okpa,
                Color.parseColor("#FF5449")));

        foods.add(new Food("ACHICHA",
                R.drawable.achicha,
                Color.parseColor("#FF7349")));

        foods.add(new Food("OFE EGUSI",
                R.drawable.egusi,
                Color.parseColor("#B13254")));



        RecyclerView recyclerView = findViewById(R.id.food_recycler_view);
        FoodAdapter adapter = new FoodAdapter(FoodActivity.this, foods);

        recyclerView.setLayoutManager(new GridLayoutManager(FoodActivity.this, 2));
        recyclerView.setAdapter(adapter);




    }
}