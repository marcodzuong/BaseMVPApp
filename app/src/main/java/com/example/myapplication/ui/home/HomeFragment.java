package com.example.myapplication.ui.home;

import com.example.myapplication.AppRemoteDataSource;
import com.example.myapplication.R;
import com.example.myapplication.base.BaseFragment;
import com.example.myapplication.base.BasePresenterImp;

public class HomeFragment extends BaseFragment<HomePresenterImp> implements HomeMvpView {

    public HomeFragment() {
        mPresenter.onAttach(this);
        mPresenter = new HomePresenterImp(AppRemoteDataSource.getInstance()) {
        };

    }

    @Override
    public void updateView() {
        mPresenter.doSomeThing();
    }

    @Override
    public int getViewLayout() {
        return R.layout.fragment_home;
    }

    @Override
    public void doTHing() {

    }
}
