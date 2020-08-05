package com.example.igboamaka.funfacts.names;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.igboamaka.R;
import com.example.igboamaka.home.sentences.SentencesPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class NamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_names);

        Toolbar toolbar = findViewById(R.id.tool_bar);
        toolbar.setTitle("Igbo Names");


        setSupportActionBar(toolbar);

        NamesPagerAdapter sentencesPagerAdapter = new NamesPagerAdapter(getSupportFragmentManager());
        ViewPager viewPager =  findViewById(R.id.names_pager);
        viewPager.setAdapter(sentencesPagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}