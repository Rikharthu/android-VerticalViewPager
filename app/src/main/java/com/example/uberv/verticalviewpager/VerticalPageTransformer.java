package com.example.uberv.verticalviewpager;

import android.support.v4.view.ViewPager;
import android.view.View;

public class VerticalPageTransformer implements ViewPager.PageTransformer {

    @Override
    public void transformPage(View page, float position) {
        View idTv = page.findViewById(R.id.id);

        if (position < -1) {
            // This page is way off-screen to the left
            page.setAlpha(0);
        } else if (position <= 1) {
            page.setAlpha(1);

            // Counteract the default slide transition
            page.setTranslationX(page.getWidth() * -position);

            // set Y position to swipe in from top
            float yPosition = position * page.getHeight();
            page.setTranslationY(yPosition);

            idTv.setTranslationY(yPosition / 2);
            idTv.setTranslationX(position * page.getWidth() / 2);

        } else {
            // This page is way off screen to the right
            page.setAlpha(0);
        }
    }
}
