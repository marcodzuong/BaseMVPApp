package com.example.myapplication.ui.main;

import com.example.myapplication.base.BasePresenterImp;
import com.example.myapplication.network.base.AppRemoteDataSource;

public class MainPresenterImp<V extends MainMvpView> extends BasePresenterImp<V> implements MainPresenter<V> {

    public void doSomeThing() {
        if (getmMvpView() == null) {
            System.out.println("null");
        } else
            getmMvpView().doThing();
    }

    private AppRemoteDataSource appRemoteDataSource;

    public MainPresenterImp(AppRemoteDataSource appRemoteDataSource) {
        this.appRemoteDataSource = appRemoteDataSource;
    }


}
