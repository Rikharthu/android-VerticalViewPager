package com.example.uberv.verticalviewpager;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Random;

public class DemoFragment extends Fragment {

    private static final String ARG_ID = "ARG_ID";

    private int mFragmentId;
    private TextView mIdTextView;

    public DemoFragment() {
        // Required empty public constructor
    }

    public static DemoFragment newInstance(int id) {
        DemoFragment fragment = new DemoFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_ID, id);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mFragmentId = getArguments().getInt(ARG_ID, -1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_demo, container, false);
        mIdTextView = root.findViewById(R.id.id);

        Random rnd = new Random();
        mIdTextView.setText("#" + mFragmentId);
        root.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));

        return root;
    }
}
