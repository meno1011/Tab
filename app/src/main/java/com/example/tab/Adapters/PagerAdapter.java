package com.example.tab.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tab.fragments.Fragment1;
import com.example.tab.fragments.Fragment2;

import java.util.ArrayList;

public class PagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> itmes = new ArrayList<Fragment>();
    private ArrayList<String> titles = new ArrayList<String>();

    public PagerAdapter(FragmentManager fm){
        super(fm);
        itmes.add(new Fragment1());
        itmes.add(new Fragment2());

        titles.add("First");
        titles.add("Second");
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return itmes.get(position);
    }
    @Override
    public CharSequence getPageTitle(int position){
        return titles.get(position);
    }
    @Override
    public int getCount() {
        return itmes.size();
    }
}
