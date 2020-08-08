package com.chisom.igboamaka.funfacts.states;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.chisom.igboamaka.R;

public class StateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);

        Toolbar toolbar = findViewById(R.id.tool_bar);
        toolbar.setTitle("Major Eastern States");


        setSupportActionBar(toolbar);
    }
}