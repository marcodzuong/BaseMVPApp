package com.example.myapplication.ui;

import android.app.Application;
import android.content.Context;

import com.facebook.drawee.backends.pipeline.Fresco;

public class App extends Application {
        private static Context context;

        public static Context getAppContext() {
            return App.context;
        }

        @Override
        public void onCreate() {
            super.onCreate();
            App.context = getApplicationContext();
            Fresco.initialize(this);
//            FacebookSdk.sdkInitialize(getApplicationContext());
//            AppEventsLogger.activateApp(this);
        }
}
