package com.magic9.gametomato.splash;

import android.os.Bundle;

import com.magic9.gametomato.R;
import com.magic9.gametomato.SplashModule;
import com.magic9.gametomato.app.BaseInjectionActivity;

import javax.inject.Inject;

public class SplashActivity extends BaseInjectionActivity implements SplashActivityContract.View {

    @Inject
    protected SplashActivityContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getInjector().inject(this);
        presenter.setView(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        presenter.removeView(this);
        super.onDestroy();
    }

    @Override
    public void startMainActivity() {

    }

    @Override
    public void reportErrorLoading() {

    }
}
