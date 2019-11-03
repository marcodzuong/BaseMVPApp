package com.example.myapplication.ui.chat;


import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseFragment;
import com.example.myapplication.network.base.AppRemoteDataSource;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChatFragment extends BaseFragment<ChatPresenterImp> implements ChatMvpView {


    public ChatFragment() {
        // Required empty public constructor
        mPresenter = new ChatPresenterImp(AppRemoteDataSource.getInstance());
        mPresenter.onAttach(this);
    }


    @Override
    public int getViewLayout() {
        return R.layout.fragment_chat;
    }

    @Override
    public void updateView() {

    }

}
