package com.example.myapplication.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.ui.account.AccountActivity;

public class SplashActivity extends BaseActivity {


    @Override
    protected void updateView() {
        new Handler().postDelayed(() -> {
            AccountActivity.start(SplashActivity.this);
            finish();
        }, 3000);
    }

    @Override
    public int getViewLayout() {
        return R.layout.activity_splash;
    }

    public static void start(Context context) {
        Intent starter = new Intent(context, SplashActivity.class);
        context.startActivity(starter);
    }
}
