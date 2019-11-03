package com.example.myapplication.ui.userdetail;

import com.example.myapplication.base.BasePresenterImp;
import com.example.myapplication.network.base.AppRemoteDataSource;

public class UserDetailPresenterImp<V extends UserDetailMvpView> extends BasePresenterImp<V> implements UserDetailPresenter<V> {
    private AppRemoteDataSource appRemoteDataSource;

    public UserDetailPresenterImp(AppRemoteDataSource appRemoteDataSource) {
        this.appRemoteDataSource = appRemoteDataSource;
    }

    public void getData() {
        getmMvpView().loadData();
    }
}
