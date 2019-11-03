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
import com.example.myapplication.model.ItemHomeCategory;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import butterknife.BindView;

public class HomeCategoryAdapter extends RecyclerView.Adapter<HomeCategoryAdapter.ViewHolder> {
    private Context context;
    private List<ItemHomeCategory> listData;

    public HomeCategoryAdapter(Context context, List<ItemHomeCategory> listData) {
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_category, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ItemHomeCategory data = listData.get(position);
        if (data.getImageUrl() != null) {
            holder.ivItemCategory.setImageURI(data.getImageUrl());
        }
        if (data.getTitle() != null) {
            holder.tvItemCategory.setText(data.getTitle());
        }
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends BaseViewHolder {
        @BindView(R.id.ivItemCategory)
        SimpleDraweeView ivItemCategory;
        @BindView(R.id.tvItemCategory)
        TextView tvItemCategory;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
