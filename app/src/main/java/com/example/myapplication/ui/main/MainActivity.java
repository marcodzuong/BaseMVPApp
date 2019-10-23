package com.example.myapplication.ui.main;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

import com.example.myapplication.AppRemoteDataSource;
import com.example.myapplication.R;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.ui.SplashActivity;

import butterknife.BindView;

public class MainActivity extends BaseActivity<MainPresenterImp> implements MainMvpView {

    @BindView(R.id.tvNoidung)
    TextView tvNoidung;
    @Override
    public int getViewLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void updateView() {
        SplashActivity.start(this);
        mPresenter = new MainPresenterImp(AppRemoteDataSource.getInstance());
        mPresenter.onAttach(this);
        mPresenter.doSomeThing();
    }

    public static void start(Context context){
        Intent starter = new Intent(context,MainActivity.class);
        context.startActivity(starter);
    }

    @Override
    public void doThing() {
        System.out.println("helo");
        tvNoidung.setText("hkasa");
    }
}
