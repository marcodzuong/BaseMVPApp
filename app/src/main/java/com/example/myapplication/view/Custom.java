package com.example.myapplication.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseCustomView;

import butterknife.BindView;

public class Custom extends BaseCustomView {

    @BindView(R.id.tv)
    TextView tv;

    public Custom(Context context) {
        super(context);
    }

    public Custom(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Custom(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Custom(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void initData() {
        tv.setText("duong van bachaskjhasdkasd a");
    }

    @Override
    public int getViewLayout() {
        return R.layout.custom;
    }
}
