package com.example.myapplication.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import butterknife.ButterKnife;

public abstract class BaseCustomView extends RelativeLayout {


    public BaseCustomView(Context context) {
        super(context);
        initView(context);
    }

    public BaseCustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public BaseCustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    public BaseCustomView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initView(context);
    }

    private void initView(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(getViewLayout(), this, true);
        ButterKnife.bind(this, view);
        initData();
    }

    protected abstract void initData();

    public abstract int getViewLayout();
}
