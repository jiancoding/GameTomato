package com.magic9.gametomato.app;

import android.app.Application;

import com.magic9.gametomato.SplashActivity;
import com.magic9.gametomato.SplashModule;

import javax.inject.Singleton;

import dagger.Component;

public class GameTomatoApp extends Application{

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate(){
        super.onCreate();

    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    @Singleton
    @Component (modules = {})
    public interface ApplicationComponent{
         SplashActivity.SplashComponent plus(SplashModule splashModule);
    }

}
