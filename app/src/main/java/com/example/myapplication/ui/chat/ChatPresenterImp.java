package com.example.myapplication.ui.chat;

import com.example.myapplication.base.BasePresenter;
import com.example.myapplication.base.BasePresenterImp;
import com.example.myapplication.network.base.AppRemoteDataSource;

public class ChatPresenterImp<V extends ChatMvpView> extends BasePresenterImp<V> implements BasePresenter<V> {
    private AppRemoteDataSource appRemoteDataSource;

    public ChatPresenterImp(AppRemoteDataSource appRemoteDataSource) {
        this.appRemoteDataSource = appRemoteDataSource;
    }
}
