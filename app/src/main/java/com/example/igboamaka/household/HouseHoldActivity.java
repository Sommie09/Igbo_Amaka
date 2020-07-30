package com.example.igboamaka.household;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.igboamaka.R;
import com.example.igboamaka.numbers.NumberPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class HouseHoldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_hold);

        Toolbar toolbar = findViewById(R.id.tool_bar);
        toolbar.setTitle("HouseHold");

        toolbar.setNavigationIcon(R.drawable.ic_baseline_keyboard_backspace_24);

        setSupportActionBar(toolbar);

        HouseholdPagerAdapter householdPagerAdapter = new HouseholdPagerAdapter(getSupportFragmentManager());
        ViewPager viewPager =  findViewById(R.id.pager);
        viewPager.setAdapter(householdPagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}