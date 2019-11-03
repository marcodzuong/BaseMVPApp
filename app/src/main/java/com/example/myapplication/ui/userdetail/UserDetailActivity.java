package com.example.myapplication.ui.userdetail;

import android.content.Context;
import android.content.Intent;

import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseActivity;

public class UserDetailActivity extends BaseActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, UserDetailActivity.class);
        context.startActivity(starter);
    }

    @Override
    public int getViewLayout() {
        return R.layout.activity_user_detail;
    }

    @Override
    protected void updateView() {
        switchFragment(new UserDetailFragment(), "UserDetailFragment");
    }

    public void switchFragment(Fragment fragment, String tag) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.UserDetailContent, fragment, tag).commit();
    }

}
