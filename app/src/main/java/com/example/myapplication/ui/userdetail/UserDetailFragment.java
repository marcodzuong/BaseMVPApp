package com.example.myapplication.ui.userdetail;


import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseFragment;
import com.example.myapplication.network.base.AppRemoteDataSource;
import com.thekhaeng.pushdownanim.PushDownAnim;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserDetailFragment extends BaseFragment<UserDetailPresenterImp> implements UserDetailMvpView {

    @BindView(R.id.tvLogout)
    LinearLayout tvLogout;

    public UserDetailFragment() {
        mPresenter = new UserDetailPresenterImp(AppRemoteDataSource.getInstance());
        mPresenter.onAttach(this);
    }

    @Override
    public int getViewLayout() {
        return R.layout.fragment_user_detail;
    }

    @Override
    public void updateView() {
        PushDownAnim.setPushDownAnimTo(tvLogout).setOnClickListener(v -> {
            getActivity().finish();
        });
        mPresenter.getData();
    }

    @Override
    public void loadData() {

    }
}
