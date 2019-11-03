package com.example.myapplication.ui.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseViewHolder;
import com.example.myapplication.model.ItemHomeCategory;
import com.example.myapplication.model.ItemHomeProduct;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class NewsFeedAdapter extends RecyclerView.Adapter {
    public static final int ITEM_VIEW_CATEGPRY = 1;
    public static final int ITEM_VIEW_PRODUCT = 2;
    public static final int ITEM_VIEW_RECENTLY_VIEWED = 0;
    public static final int ITEM_VIEW_SUGGESTIONS = 3;


    private Context context;

    public NewsFeedAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == ITEM_VIEW_CATEGPRY) {
            return new CategoryViewHolder(LayoutInflater.from(context).inflate(R.layout.item_home_category, parent, false));
        } else if (viewType == ITEM_VIEW_PRODUCT) {
            return new ProductViewHolder((LayoutInflater.from(context).inflate(R.layout.item_home_product, parent, false)));
        } else if (viewType == ITEM_VIEW_RECENTLY_VIEWED) {
            return new RecentlyViewedViewHolder(LayoutInflater.from(context).inflate(R.layout.item_home_recently_viewed, parent, false));
        } else if (viewType == ITEM_VIEW_SUGGESTIONS) {
            System.out.printf("Trc");
            return new SuggestionsViewHolder(LayoutInflater.from(context).inflate(R.layout.item_suggestions, parent, false));


        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof CategoryViewHolder) {
            CategoryViewHolder vhCategory = (CategoryViewHolder) holder;
            vhCategory.tvCategory.setText("Ngành hàng quan tâm");
            vhCategory.rvCategory.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
            List<ItemHomeCategory> listData = new ArrayList<>();
            listData.add(new ItemHomeCategory("https://aphoto.vn/wp-content/uploads/2018/10/bin-bigbike.jpg", "Thời Trang  mẹ và bé"));
            listData.add(new ItemHomeCategory("https://cdn.trangcongnghe.com/uploads/posts/2016-12/huong-dan-meo-chup-va-chinh-sua-anh-dep-tren-smartphone_1.jpeg", "Điện thoại - máy tính bảng"));
            listData.add(new ItemHomeCategory("http://kenh14cdn.com/crop/640_360/2019/3/21/photo-1-1553155372658221231913-crop-1553156537777464521534.jpg", "Làm đẹp sức khỏe"));
            listData.add(new ItemHomeCategory("https://anh.eva.vn/upload/1-2017/images/2017-03-16/nin-tho-truoc-do-ao-dieu-cua-10-buc-anh-dep-nhat-nam-2017-1-1489637460-width800height534.jpg", "Điện gia dụng"));
            listData.add(new ItemHomeCategory("https://vtv1.mediacdn.vn/2018/11/22/photo-3-15428716111551636354706.jpg", "Thời trang"));
            listData.add(new ItemHomeCategory("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3Bxg4i9EBLdGXeK0soP-kzoZWAv2WzCpHBO9mRMWNc0-KjoxU1w&s", "Điện tử - Điện lạnh"));
            HomeCategoryAdapter adapter = new HomeCategoryAdapter(context, listData);
            vhCategory.rvCategory.setAdapter(adapter);
        } else if (holder instanceof ProductViewHolder) {
            ProductViewHolder vhProduct = (ProductViewHolder) holder;
            vhProduct.rvProduct.setLayoutManager(new GridLayoutManager(context, 2, GridLayoutManager.HORIZONTAL, false));
            vhProduct.tvProduct.setText("Những mặt hàng đang hot");
            List<ItemHomeProduct> listData = new ArrayList<>();
            listData.add(new ItemHomeProduct("https://aphoto.vn/wp-content/uploads/2018/10/bin-bigbike.jpg", "-20%"));
            listData.add(new ItemHomeProduct("https://cdn.trangcongnghe.com/uploads/posts/2016-12/huong-dan-meo-chup-va-chinh-sua-anh-dep-tren-smartphone_1.jpeg", "-20%"));
            listData.add(new ItemHomeProduct("http://kenh14cdn.com/crop/640_360/2019/3/21/photo-1-1553155372658221231913-crop-1553156537777464521534.jpg", "-20%"));
            listData.add(new ItemHomeProduct("https://anh.eva.vn/upload/1-2017/images/2017-03-16/nin-tho-truoc-do-ao-dieu-cua-10-buc-anh-dep-nhat-nam-2017-1-1489637460-width800height534.jpg", "-20%"));
            listData.add(new ItemHomeProduct("https://vtv1.mediacdn.vn/2018/11/22/photo-3-15428716111551636354706.jpg", "-20%"));
            listData.add(new ItemHomeProduct("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3Bxg4i9EBLdGXeK0soP-kzoZWAv2WzCpHBO9mRMWNc0-KjoxU1w&s", "-20%"));
            listData.add(new ItemHomeProduct("https://aphoto.vn/wp-content/uploads/2018/10/bin-bigbike.jpg", "-20%"));
            listData.add(new ItemHomeProduct("https://cdn.trangcongnghe.com/uploads/posts/2016-12/huong-dan-meo-chup-va-chinh-sua-anh-dep-tren-smartphone_1.jpeg", "-20%"));
            listData.add(new ItemHomeProduct("http://kenh14cdn.com/crop/640_360/2019/3/21/photo-1-1553155372658221231913-crop-1553156537777464521534.jpg", "Làm đẹp sức khỏe"));
            listData.add(new ItemHomeProduct("https://anh.eva.vn/upload/1-2017/images/2017-03-16/nin-tho-truoc-do-ao-dieu-cua-10-buc-anh-dep-nhat-nam-2017-1-1489637460-width800height534.jpg", "-20%"));
            listData.add(new ItemHomeProduct("https://vtv1.mediacdn.vn/2018/11/22/photo-3-15428716111551636354706.jpg", "Thời trang"));
            listData.add(new ItemHomeProduct("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3Bxg4i9EBLdGXeK0soP-kzoZWAv2WzCpHBO9mRMWNc0-KjoxU1w&s", "-81%"));
            HomeProductAdapter adapter = new HomeProductAdapter(context, listData);
            vhProduct.rvProduct.setAdapter(adapter);

        } else if (holder instanceof RecentlyViewedViewHolder) {
            RecentlyViewedViewHolder vhRecently = (RecentlyViewedViewHolder) holder;
            vhRecently.rvRecentlyViewed.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
            vhRecently.tvRecentlyViewed.setText("Đã xem gần đây ");
            HomeRecentlyViewedAdapter adapter = new HomeRecentlyViewedAdapter(context);
            vhRecently.rvRecentlyViewed.setAdapter(adapter);
        } else if (holder instanceof SuggestionsViewHolder) {
            SuggestionsViewHolder vhSuggestions = (SuggestionsViewHolder) holder;
            vhSuggestions.ivItemSuggestions.setImageURI("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT-pkI2PLl2uKbZHMrVjZ-zBtClFma8-vrttO55FI98mnS_vnCdNw&s");
        }
    }


    @Override
    public int getItemViewType(int position) {
        switch (position) {
            case 0:
                return ITEM_VIEW_RECENTLY_VIEWED;
            case 1:
                return ITEM_VIEW_CATEGPRY;
            case 2:
                return ITEM_VIEW_PRODUCT;
            default:
                return ITEM_VIEW_SUGGESTIONS;
        }

    }

    @Override
    public int getItemCount() {
        return 20;
    }


    public class ProductViewHolder extends BaseViewHolder {
        @BindView(R.id.tvProduct)
        TextView tvProduct;
        @BindView(R.id.rvProduct)
        RecyclerView rvProduct;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }


    public class CategoryViewHolder extends BaseViewHolder {
        @BindView(R.id.rvCategory)
        RecyclerView rvCategory;
        @BindView(R.id.tvCategory)
        TextView tvCategory;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public class RecentlyViewedViewHolder extends BaseViewHolder {
        @BindView(R.id.tvRecentlyViewed)
        TextView tvRecentlyViewed;
        @BindView(R.id.rvRecentlyViewed)
        RecyclerView rvRecentlyViewed;

        public RecentlyViewedViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public class SuggestionsViewHolder extends BaseViewHolder {
        @BindView(R.id.ivItemSuggestions)
        SimpleDraweeView ivItemSuggestions;

        public SuggestionsViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
