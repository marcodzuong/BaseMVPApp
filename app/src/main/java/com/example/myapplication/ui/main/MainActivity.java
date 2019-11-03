package com.example.myapplication.ui.main;

import android.content.Context;
import android.content.Intent;

import androidx.viewpager.widget.ViewPager;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.network.base.AppRemoteDataSource;
import com.example.myapplication.ui.chat.ChatFragment;
import com.example.myapplication.ui.home.HomeFragment;
import com.example.myapplication.ui.main.adapter.MainPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import butterknife.BindView;

public class MainActivity extends BaseActivity<MainPresenterImp> implements MainMvpView {
    @BindView(R.id.mainViewPager)
    ViewPager mainViewPager;
    @BindView(R.id.bottomNavigation)
    BottomNavigationView bottomNavigation;
    @Override
    public int getViewLayout() {
        return R.layout.activity_main;
    }

    BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = menuItem -> {
        switch (menuItem.getItemId()) {
            case R.id.mainHome:
                System.out.println("home");
                mainViewPager.setCurrentItem(0);
                return true;
            case R.id.mainChat:
                System.out.println("chat");
                mainViewPager.setCurrentItem(1);
                return true;
        }
        return false;
    };

    @Override
    protected void updateView() {
        //  SplashActivity.start(this);
        mPresenter = new MainPresenterImp(AppRemoteDataSource.getInstance());
        mPresenter.onAttach(this);
        mPresenter.doSomeThing();
        bottomNavigation.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);
        MainPagerAdapter adapter = new MainPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment());
        adapter.addFragment(new ChatFragment());
        mainViewPager.setAdapter(adapter);
        mainViewPager.setHorizontalScrollBarEnabled(false);

    }


    public static void start(Context context){
        Intent starter = new Intent(context,MainActivity.class);
        context.startActivity(starter);
    }

    @Override
    public void doThing() {
        //System.out.println("helo");
    }
}
