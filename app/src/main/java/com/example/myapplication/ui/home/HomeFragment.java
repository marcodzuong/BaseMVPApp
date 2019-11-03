package com.example.myapplication.ui.home;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.asksira.loopingviewpager.LoopingViewPager;
import com.example.myapplication.R;
import com.example.myapplication.base.BaseFragment;
import com.example.myapplication.model.ItemBanner;
import com.example.myapplication.network.base.AppRemoteDataSource;
import com.example.myapplication.ui.home.adapter.BannerInfiniteAdapter;
import com.example.myapplication.ui.home.adapter.NewsFeedAdapter;
import com.rd.PageIndicatorView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class HomeFragment extends BaseFragment<HomePresenterImp> implements HomeMvpView {
    private static final int BANNER_LIST = 4;
    @BindView(R.id.rvNewsFeed)
    RecyclerView rvNewsFeed;
    @BindView(R.id.loopingViewPager)
    LoopingViewPager loopingViewPager;
    @BindView(R.id.pageIndicator)
    PageIndicatorView pageIndicator;
    RecyclerView.OnScrollListener listener = new RecyclerView.OnScrollListener() {
        @Override
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);

        }
    };

    public HomeFragment() {
        mPresenter = new HomePresenterImp(AppRemoteDataSource.getInstance());
        mPresenter.onAttach(this);
    }

    @Override
    public int getViewLayout() {
        return R.layout.fragment_home;
    }

    @Override
    public void doTHing() {

    }

    @Override
    public void updateView() {

        List<ItemBanner> bannerList = new ArrayList<>();
        bannerList.add(new ItemBanner("https://zicxa.com/hinh-anh/wp-content/uploads/2019/06/Tuy%E1%BB%83n-t%E1%BA%ADp-h%C3%ACnh-n%E1%BB%81n-4K-d%C3%A0nh-cho-m%C3%A1y-t%C3%ADnh-%C4%91%E1%BA%B9p-5.jpg"));
        bannerList.add(new ItemBanner("https://www.syfy.com/sites/syfy/files/2017/10/breath-of-the-wild-nintendo.jpg"));
        bannerList.add(new ItemBanner("https://4.bp.blogspot.com/-ZWsQSXPQVcQ/WvUlXAzEv4I/AAAAAAAADfs/NJiEoz3hF1A8_u0WpUVCiSXBZLSZyGRrwCLcBGAs/s1600/aerial_view_of_el_yeso-wallpaper-2048x1152.jpg"));
        bannerList.add(new ItemBanner("https://png.pngtree.com/thumb_back/fw800/background/20190221/ourmid/pngtree-antiquity-creative-synthesis-generous-good-looking-image_12620.jpg"));
        BannerInfiniteAdapter adapter = new BannerInfiniteAdapter(getContext(), bannerList, true);
        loopingViewPager.setAdapter(adapter);
        loopingViewPager.setIndicatorPageChangeListener(new LoopingViewPager.IndicatorPageChangeListener() {
            @Override
            public void onIndicatorProgress(int selectingPosition, float progress) {
            }

            @Override
            public void onIndicatorPageChange(int newIndicatorPosition) {
                pageIndicator.setSelected(newIndicatorPosition);

            }
        });


        rvNewsFeed.setLayoutManager(new LinearLayoutManager(getContext()));
        NewsFeedAdapter adapterNewsFeed = new NewsFeedAdapter(getContext());
        rvNewsFeed.setAdapter(adapterNewsFeed);
        mPresenter.doSomeThing();
    }

    @Override
    public void onPause() {
        super.onPause();
        loopingViewPager.pauseAutoScroll();
    }

}
