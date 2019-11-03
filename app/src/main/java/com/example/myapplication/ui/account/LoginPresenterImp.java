package com.example.myapplication.ui.account;

import com.example.myapplication.base.BasePresenter;
import com.example.myapplication.base.BasePresenterImp;
import com.example.myapplication.network.base.AppRemoteDataSource;

public class LoginPresenterImp<V extends LoginMvpView> extends BasePresenterImp<V> implements BasePresenter<V> {
   // private HomeMvpView mvpView;
    private AppRemoteDataSource appRemoteDataSource;


//    public void attach(HomeMvpView mvpView){
//        this.mvpView = mvpView;
//    }

    public LoginPresenterImp(AppRemoteDataSource appRemoteDataSource) {
        this.appRemoteDataSource = appRemoteDataSource;
    }

    public void login() {
        if (getmMvpView() == null) {
            System.out.println("login null");
        } else
            getmMvpView().loadData();
    }



}
