package com.example.myapplication.ui.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.asksira.loopingviewpager.LoopingPagerAdapter;
import com.example.myapplication.R;
import com.example.myapplication.model.ItemBanner;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

public class BannerInfiniteAdapter extends LoopingPagerAdapter<ItemBanner> {

    public BannerInfiniteAdapter(Context context, List<ItemBanner> itemList, boolean isInfinite) {
        super(context, itemList, isInfinite);
    }

    @Override
    protected View inflateView(int viewType, ViewGroup container, int listPosition) {
        return LayoutInflater.from(context).inflate(R.layout.item_banner, container, false);
    }

    @Override
    protected void bindView(View convertView, int listPosition, int viewType) {
        SimpleDraweeView ivBanner = convertView.findViewById(R.id.ivBanner);
        ivBanner.setImageURI(itemList.get(listPosition).getUri());
    }
}
