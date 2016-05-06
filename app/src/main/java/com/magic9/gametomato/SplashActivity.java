package com.magic9.gametomato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.magic9.gametomato.app.GameTomatoApp;

import dagger.Subcomponent;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getInjector().inject(this);

    }

    public SplashInjector getInjector(){
        return ((GameTomatoApp)getApplication()).getApplicationComponent().plus(new SplashModule());
    }


    @Subcomponent(modules = {SplashModule.class})
    public interface SplashComponent extends SplashInjector {
    }
}
