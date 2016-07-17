package com.magic9.gametomato.app;

import android.content.Context;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private final GameTomatoApp app;

    public ApplicationModule(GameTomatoApp app) {
        this.app = app;
    }

    @Provides
    public GameTomatoApp provideApplication() {
        return app;
    }

    @Provides
    @Named("application_context")
    public Context provideApplicationContext() {
        return app.getApplicationContext();
    }

}
