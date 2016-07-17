package com.magic9.gametomato.app;

import android.app.Application;

import com.magic9.gametomato.BuildConfig;
import com.magic9.gametomato.splash.SplashActivity;
import com.magic9.gametomato.SplashModule;
import com.squareup.leakcanary.LeakCanary;

import javax.inject.Singleton;

import dagger.Component;
import timber.log.Timber;

public class GameTomatoApp extends Application{
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate(){
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        applicationComponent = DaggerGameTomatoApp_ApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        LeakCanary.install(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    @Singleton
    @Component (modules = {ApplicationModule.class, ViewModule.class})
    public interface ApplicationComponent{
        void inject(SplashActivity splashActivity);
    }

}
