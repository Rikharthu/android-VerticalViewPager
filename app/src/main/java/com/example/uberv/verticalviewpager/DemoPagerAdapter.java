package com.example.uberv.verticalviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class DemoPagerAdapter extends FragmentPagerAdapter {

    private int mCount;

    public DemoPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public DemoPagerAdapter(FragmentManager fm, int count) {
        super(fm);
        mCount = count;
    }

    @Override
    public Fragment getItem(int position) {
        return DemoFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return mCount;
    }
}
