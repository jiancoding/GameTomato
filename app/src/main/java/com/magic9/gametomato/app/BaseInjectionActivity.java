package com.magic9.gametomato.app;

import android.support.v7.app.AppCompatActivity;

public class BaseInjectionActivity extends AppCompatActivity{
    public GameTomatoApp.ApplicationComponent getInjector() {
        return ((GameTomatoApp) getApplicationContext()).getApplicationComponent();
    }

}
