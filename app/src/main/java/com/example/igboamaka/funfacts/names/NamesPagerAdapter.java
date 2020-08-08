package com.example.igboamaka.funfacts.names;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

@SuppressWarnings({"ALL", "deprecation", "ConstantConditions"})
public class NamesPagerAdapter extends FragmentPagerAdapter {

    public NamesPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new BoysFragment();
            case 1:
                return new GirlsFragment();
        }
        return null;
    }


    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        CharSequence title;
        if (position == 0) {
            title = "BOYS";
        }else{
            title = "GIRLS";
        }
        return title;
    }
}
