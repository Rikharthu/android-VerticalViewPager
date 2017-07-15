package com.example.uberv.verticalviewpager;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final int FRAGMENT_COUNT = 12;

    private ViewPager mPager;
    private DemoPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPager = (ViewPager) findViewById(R.id.pager);
        mAdapter = new DemoPagerAdapter(getSupportFragmentManager(), FRAGMENT_COUNT);
        mPager.setPageTransformer(true, new VerticalPageTransformer());
        mPager.setAdapter(mAdapter);

    }


    public void scrollDown(View view) {
        int currentItem = mPager.getCurrentItem();
        if (currentItem == mAdapter.getCount()) {
            return;
        }
        mPager.setCurrentItem(++currentItem, true);
    }

    public void scrollUp(View view) {
        int currentItem = mPager.getCurrentItem();
        if (currentItem == 0) {
            return;
        }
        mPager.setCurrentItem(--currentItem, true);
    }
}
