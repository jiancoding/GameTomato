package com.magic9.gametomato.app;

import com.magic9.gametomato.splash.SplashActivityContract;
import com.magic9.gametomato.splash.SplashPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ViewModule {
    @Singleton
    @Provides
    public SplashActivityContract.Presenter provideSplashPresenter(){
        return new SplashPresenter();
    }
}
