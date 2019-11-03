package com.example.myapplication.ui.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseViewHolder;
import com.example.myapplication.model.ItemHomeProduct;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import butterknife.BindView;

public class HomeProductAdapter extends RecyclerView.Adapter<HomeProductAdapter.ViewHolder> {
    private Context context;
    private List<ItemHomeProduct> listData;

    public HomeProductAdapter(Context context, List<ItemHomeProduct> listData) {
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_product, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ItemHomeProduct data = listData.get(position);
        holder.ivItemProduct.setImageURI(data.getImageUrl());
        holder.tvItemProductDisCount.setText(data.getDisCount());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends BaseViewHolder {
        @BindView(R.id.ivItemProduct)
        SimpleDraweeView ivItemProduct;
        @BindView(R.id.tvItemProductDisCount)
        TextView tvItemProductDisCount;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
