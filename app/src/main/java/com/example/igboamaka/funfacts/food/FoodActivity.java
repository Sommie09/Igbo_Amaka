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
        toolbar.setTitle("Family");

        toolbar.setNavigationIcon(R.drawable.ic_baseline_keyboard_backspace_24);

        setSupportActionBar(toolbar);

        foods = new ArrayList<>();

        foods.add(new Food("Abacha",
                R.drawable.abacha,
                "Abacha is an Eastern Nigeria dish made using dried, shredded cassava. You can eat it as a snack or a full meal.",
                Color.parseColor("#B13254")));

        foods.add(new Food("Abacha",
                R.drawable.abacha,
                "Abacha is an Eastern Nigeria dish made using dried, shredded cassava. You can eat it as a snack or a full meal.",
                Color.parseColor("#B13254")));

        foods.add(new Food("Abacha",
                R.drawable.abacha,
                "Abacha is an Eastern Nigeria dish made using dried, shredded cassava. You can eat it as a snack or a full meal.",
                Color.parseColor("#B13254")));

        foods.add(new Food("Abacha",
                R.drawable.abacha,
                "Abacha is an Eastern Nigeria dish made using dried, shredded cassava. You can eat it as a snack or a full meal.",
                Color.parseColor("#B13254")));

        foods.add(new Food("Abacha",
                R.drawable.abacha,
                "Abacha is an Eastern Nigeria dish made using dried, shredded cassava. You can eat it as a snack or a full meal.",
                Color.parseColor("#B13254")));

        foods.add(new Food("Abacha",
                R.drawable.abacha,
                "Abacha is an Eastern Nigeria dish made using dried, shredded cassava. You can eat it as a snack or a full meal.",
                Color.parseColor("#B13254")));

        foods.add(new Food("Abacha",
                R.drawable.abacha,
                "Abacha is an Eastern Nigeria dish made using dried, shredded cassava. You can eat it as a snack or a full meal.",
                Color.parseColor("#B13254")));

        foods.add(new Food("Abacha",
                R.drawable.abacha,
                "Abacha is an Eastern Nigeria dish made using dried, shredded cassava. You can eat it as a snack or a full meal.",
                Color.parseColor("#B13254")));

        foods.add(new Food("Abacha",
                R.drawable.abacha,
                "Abacha is an Eastern Nigeria dish made using dried, shredded cassava. You can eat it as a snack or a full meal.",
                Color.parseColor("#B13254")));

        foods.add(new Food("Abacha",
                R.drawable.abacha,
                "Abacha is an Eastern Nigeria dish made using dried, shredded cassava. You can eat it as a snack or a full meal.",
                Color.parseColor("#B13254")));

        foods.add(new Food("Abacha",
                R.drawable.abacha,
                "Abacha is an Eastern Nigeria dish made using dried, shredded cassava. You can eat it as a snack or a full meal.",
                Color.parseColor("#B13254")));

        foods.add(new Food("Abacha",
                R.drawable.abacha,
                "Abacha is an Eastern Nigeria dish made using dried, shredded cassava. You can eat it as a snack or a full meal.",
                Color.parseColor("#B13254")));

        foods.add(new Food("Abacha",
                R.drawable.abacha,
                "Abacha is an Eastern Nigeria dish made using dried, shredded cassava. You can eat it as a snack or a full meal.",
                Color.parseColor("#B13254")));

        foods.add(new Food("Abacha",
                R.drawable.abacha,
                "Abacha is an Eastern Nigeria dish made using dried, shredded cassava. You can eat it as a snack or a full meal.",
                Color.parseColor("#B13254")));


        RecyclerView recyclerView = findViewById(R.id.food_recycler_view);
        FoodAdapter adapter = new FoodAdapter(FoodActivity.this, foods);

        recyclerView.setLayoutManager(new GridLayoutManager(FoodActivity.this, 2));
        recyclerView.setAdapter(adapter);




    }
}