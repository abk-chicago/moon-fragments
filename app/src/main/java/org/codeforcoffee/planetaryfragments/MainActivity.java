package org.codeforcoffee.planetaryfragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        // add io
        MoonFragment moon = new MoonFragment();
        Bundle moonBundle = new Bundle();
        String moonName = getResources().getString(R.string.Io);
        moonBundle.putString("NAME", moonName);
        moon.setArguments(moonBundle);
        ft.add(R.id.fragment_container, moon);
        // land on europa
        MoonFragment europa = new MoonFragment();
        Bundle europaBundle = new Bundle();
        europaBundle.putString("NAME", getResources().getString(R.string.Europa));
        europa.setArguments(europaBundle);
        ft.add(R.id.fragment_container, europa);
        // callisto
        // ganymede
        // stop! hammertime!
        ft.commit();
    }
}
