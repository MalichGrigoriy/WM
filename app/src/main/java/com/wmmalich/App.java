package com.wmmalich;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

import com.wmmalich.di.AppComponent;
import com.wmmalich.di.DaggerAppComponent;


public class App extends Application {

    private static App mInstance;
    protected static AppComponent appComponent;

    public static AppComponent getComponent() {
        return appComponent;
    }

    protected void initComponent() {
        appComponent = DaggerAppComponent.
                builder()
                .build();
        appComponent.inject(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        initComponent();
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    public static synchronized App getInstance() {
        return mInstance;
    }


}
