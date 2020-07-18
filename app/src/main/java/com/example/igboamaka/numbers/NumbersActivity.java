package com.example.igboamaka.numbers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.igboamaka.MainActivity;
import com.example.igboamaka.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.TabLayout;

public class NumbersActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        Toolbar toolbar = findViewById(R.id.tool_bar);
        toolbar.setTitle("Numbers");

        toolbar.setNavigationIcon(R.drawable.ic_baseline_keyboard_backspace_24);

        setSupportActionBar(toolbar);

        NumberPagerAdapter numberPagerAdapter = new NumberPagerAdapter(getSupportFragmentManager());
        ViewPager viewPager =  findViewById(R.id.pager);
        viewPager.setAdapter(numberPagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}