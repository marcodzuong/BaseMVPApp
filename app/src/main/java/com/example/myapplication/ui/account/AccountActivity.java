package com.example.myapplication.ui.account;

import android.content.Context;
import android.content.Intent;

import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseActivity;

public class AccountActivity extends BaseActivity {



    @Override
    public int getViewLayout() {
        return R.layout.activity_account;
    }

    @Override
    protected void updateView() {

        switchFragment(new LoginFragment(), "LoginFragment");
    }

    public void switchFragment(Fragment fragment, String tag) {
       getSupportFragmentManager().beginTransaction()
               .replace(R.id.AccountContent,fragment,tag).commit();
    }
    public static void start(Context context){
        Intent starter = new Intent(context, AccountActivity.class);
        context.startActivity(starter);
    }
}
