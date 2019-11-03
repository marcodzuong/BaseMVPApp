package com.example.myapplication.ui.main.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> listFragment = new ArrayList<>();

    public MainPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }


    @Override
    public int getCount() {
        return listFragment.size();
    }

    public void addFragment(Fragment fragment) {
        listFragment.add(fragment);
    }
}
