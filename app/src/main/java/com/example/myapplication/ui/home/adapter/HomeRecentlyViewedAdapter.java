package com.example.myapplication.ui.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseViewHolder;
import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;

public class HomeRecentlyViewedAdapter extends RecyclerView.Adapter<HomeRecentlyViewedAdapter.ViewHolder> {
    private Context context;

    public HomeRecentlyViewedAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_recently_viewed, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.ivItemRecentlyViewed.setImageURI("https://ttol.vietnamnetjsc.vn/images/2019/07/17/16/06/diem-thi-cua-hot-girl-hot-boy-1.jpg");
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends BaseViewHolder {
        @BindView(R.id.ivItemRecentlyViewed)
        SimpleDraweeView ivItemRecentlyViewed;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
