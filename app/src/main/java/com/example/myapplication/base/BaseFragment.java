package com.example.myapplication.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.facebook.drawee.backends.pipeline.Fresco;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseFragment<P extends BasePresenterImp> extends Fragment implements MvpView {

    private Unbinder mUnbinder;
    protected P mPresenter;

    public void setBinder(Unbinder unbinder) {
        this.mUnbinder = unbinder;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Fresco.initialize(getContext());
        View view =  inflater.inflate(getViewLayout(), container, false);
        mUnbinder= ButterKnife.bind(this,view);
        updateView();
        return view;
    }


    public abstract int getViewLayout();

    public abstract void updateView();


    @Override
    public void onDetach() {

        super.onDetach();

    }

    @Override
    public void onDestroy() {
        if (mUnbinder != null) {
            mUnbinder.unbind();
        }
        super.onDestroy();
    }
}
