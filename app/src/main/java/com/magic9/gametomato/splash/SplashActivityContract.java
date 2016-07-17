package com.magic9.gametomato.splash;

import com.magic9.gametomato.MvpPresenter;
import com.magic9.gametomato.MvpView;

public interface SplashActivityContract {

    interface View extends MvpView {
        void startMainActivity();

        void reportErrorLoading();
    }

    interface Presenter extends MvpPresenter<View> {
        void loadInitialData();
    }
}
