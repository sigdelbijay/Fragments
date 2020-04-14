package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentManager theFragmentManager = getSupportFragmentManager();
        FragmentTransaction theFragmentTransaction = theFragmentManager.beginTransaction();
        Configuration deviceConfig = getResources().getConfiguration();

        if(deviceConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            FragmentLandscape fragmentLandscape = new FragmentLandscape();
            theFragmentTransaction.replace(android.R.id.content, fragmentLandscape);
        } else {
            FragmentPortrait fragmentPortrait = new FragmentPortrait();
            theFragmentTransaction.replace(android.R.id.content, fragmentPortrait);
        }
        theFragmentTransaction.commit();

    }
}
