package com.wmmalich.view;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.wmmalich.R;

public class MainActivity extends AppCompatActivity {

    private FragmentManager mainFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainFragmentManager = getSupportFragmentManager();

        if (savedInstanceState == null) {
            ScrollFragment scrollFragment = ScrollFragment.newInstance();
            mainFragmentManager.beginTransaction().replace(R.id.main_container, scrollFragment, ScrollFragment.tag()).commit();
        }
    }



}
