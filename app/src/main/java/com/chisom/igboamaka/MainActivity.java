package com.chisom.igboamaka;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;

import com.chisom.igboamaka.funfacts.FunFactsFragment;
import com.chisom.igboamaka.home.HomeFragment;
import com.chisom.igboamaka.quiz.QuizFragment;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    ChipNavigationBar bottom_navigation;
    FragmentManager mFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottom_navigation = findViewById(R.id.bottom_nav);

         if(savedInstanceState == null){
             bottom_navigation.setItemSelected(R.id.home, true);
             mFragmentManager = getSupportFragmentManager();
             HomeFragment homeFragment = new HomeFragment();
             mFragmentManager.beginTransaction()
                     .replace(R.id.fragment_container, homeFragment)
                     .commit();

         }

        bottom_navigation.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int id) {
                Fragment fragment = null;
                switch (id){
                    case R.id.home:
                        fragment = new HomeFragment();
                        break;
                    case R.id.quiz:
                        fragment = new QuizFragment();
                        break;
                    case R.id.fun_facts:
                        fragment = new FunFactsFragment();
                        break;
                }

                if(fragment != null){
                    mFragmentManager = getSupportFragmentManager();
                    mFragmentManager.beginTransaction()
                                    .replace(R.id.fragment_container, fragment)
                                    .commit();

                }else{
                    Log.e(TAG, "Error in creating fragment");
                }
            }
        });


    }
}