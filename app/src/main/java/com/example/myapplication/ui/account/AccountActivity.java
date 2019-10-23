package com.example.myapplication.ui.account;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.ui.main.MainActivity;

public class AccountActivity extends BaseActivity {



    @Override
    public int getViewLayout() {
        return R.layout.activity_account;
    }

    @Override
    protected void updateView() {

        swithFragment(new LoginFragment(),"LoginFragment");
    }
    public void swithFragment(Fragment fragment,String tag){
       getSupportFragmentManager().beginTransaction()
               .replace(R.id.AccountContent,fragment,tag).commit();
    }
    public static void start(Context context){
        Intent starter = new Intent(context, AccountActivity.class);
        context.startActivity(starter);
    }
}
