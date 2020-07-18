package com.example.igboamaka.numbers;



import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.igboamaka.R;


public class NumberPagerAdapter extends FragmentPagerAdapter {

    public NumberPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return 4;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new OneToTenFragment();
            case 1:
                return new ElevenToTwentyFragment();
            case 2:
                return new TensFragment();
            case 3:
                return new HundredsFragment();
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        CharSequence title;
        if (position == 0) {
            title = "1-10";
        } else if (position == 1) {
            title = "11-20";
        } else if (position == 2) {
            title = "TENS";
        }else{
            title = "HUNDREDS";
        }
        return title;
    }
}