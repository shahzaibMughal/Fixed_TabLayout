package com.example.shahzaib.fixed_tablayout;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter  extends FragmentPagerAdapter{

    List<Fragment> fragments = new ArrayList<>();
    List<String>   tabItemTitles = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment, String tabItemTitle)
    {
        fragments.add(fragment);
        tabItemTitles.add(tabItemTitle);
    }



    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabItemTitles.get(position);
    }

    @Override
    public int getCount() { //returns how many items our tab layout have
        return tabItemTitles.size();
    }
}
