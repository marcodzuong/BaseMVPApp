package com.example.myapplication.base;

public interface BasePresenter<V extends MvpView> {
    void onAttach(V mvpView);

    void onDetach();




}
