package com.magic9.gametomato.splash;

import javax.inject.Inject;

public class SplashPresenter implements SplashActivityContract.Presenter{

    private boolean loadCompleted;
    private boolean loadFailed;
    private SplashActivityContract.View view;

    @Inject
    public SplashPresenter() {
    }

    @Override
    public void loadInitialData() {
        loadCompleted = false;
        loadFailed = false;
    }

    @Override
    public void setView(SplashActivityContract.View view) {
        this.view = view;
        if (loadCompleted) {
            view.startMainActivity();
        } else if (loadFailed) {
            view.reportErrorLoading();
        }
    }

    @Override
    public void removeView(SplashActivityContract.View view) {
        this.view = null;
    }
}
