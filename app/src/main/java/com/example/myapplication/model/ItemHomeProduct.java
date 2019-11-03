package com.example.myapplication.model;

public class ItemHomeProduct {
    private String imageUrl;
    private String disCount;

    public ItemHomeProduct(String imageUrl, String disCount) {
        this.imageUrl = imageUrl;
        this.disCount = disCount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDisCount() {
        return disCount;
    }

    public void setDisCount(String disCount) {
        this.disCount = disCount;
    }
}
