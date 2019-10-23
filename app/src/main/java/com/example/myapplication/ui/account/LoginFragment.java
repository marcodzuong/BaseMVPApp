package com.example.myapplication.ui.account;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.widget.TextView;

import com.example.myapplication.AppRemoteDataSource;
import com.example.myapplication.R;
import com.example.myapplication.base.BaseFragment;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends BaseFragment<LoginPresenterImp> implements LoginMvpView {

    @BindView(R.id.tvLogin)
    TextView tvLogin;

    public LoginFragment() {
        mPresenter = new LoginPresenterImp(AppRemoteDataSource.getInstance());
        mPresenter.onAttach(this);

    }



    @Override
    public void updateView() {
        mPresenter.login();
    }

    @Override
    public int getViewLayout() {
        return R.layout.fragment_login;
    }

    @Override
    public void loadData() {
         tvLogin.setText("asklafas");
    }

}
