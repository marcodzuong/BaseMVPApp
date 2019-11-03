package com.example.myapplication.ui.account;


import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseFragment;
import com.example.myapplication.network.base.AppRemoteDataSource;
import com.example.myapplication.ui.userdetail.UserDetailActivity;

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
        UserDetailActivity.start(getContext());
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
