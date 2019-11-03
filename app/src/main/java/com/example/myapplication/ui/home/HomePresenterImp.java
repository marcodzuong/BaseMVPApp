package com.example.myapplication.ui.home;

import com.example.myapplication.base.BasePresenterImp;
import com.example.myapplication.network.base.AppRemoteDataSource;

public  class HomePresenterImp <V extends HomeMvpView> extends BasePresenterImp<V> implements HomePresenter<V> {
    private HomeMvpView mMvpView;


    private AppRemoteDataSource appRemoteDataSource ;

    public HomePresenterImp(AppRemoteDataSource appRemoteDataSource ) {
        this.appRemoteDataSource = appRemoteDataSource;
    }
    public  void doSomeThing(){
        getmMvpView().doTHing();
    }

}
