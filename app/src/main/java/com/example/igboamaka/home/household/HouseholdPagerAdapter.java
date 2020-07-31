package com.example.igboamaka.home.household;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class HouseholdPagerAdapter extends FragmentPagerAdapter {

    public HouseholdPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 2;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new BedroomFragment();
            case 1:
                return new KitchenFragment();
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        CharSequence title;
        if (position == 0) {
            title = "BEDROOM";
        }else{
            title = "KITCHEN";
        }
        return title;
    }


}
