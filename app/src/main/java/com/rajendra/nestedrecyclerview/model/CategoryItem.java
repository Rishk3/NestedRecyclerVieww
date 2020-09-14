package com.rajendra.nestedrecyclerview.model;

public class CategoryItem {

// here i am taking only image url. and this is as integer because i am using it from drawable file.

    Integer itemId;
    Integer imageUrl;
    String product_name,item_original_price,item_new_price,item_discount;


    public CategoryItem(Integer itemId, Integer imageUrl,String product_name,String item_original_price,String item_new_price,String item_discount) {
        this.itemId = itemId;
        this.imageUrl = imageUrl;
        this.product_name=product_name;
        this.item_new_price=item_new_price;
        this.item_original_price=item_original_price;
        this.item_discount=item_discount;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getItem_original_price() {
        return item_original_price;
    }

    public void setItem_original_price(String item_original_price) {
        this.item_original_price = item_original_price;
    }

    public String getItem_new_price() {
        return item_new_price;
    }

    public void setItem_new_price(String item_new_price) {
        this.item_new_price = item_new_price;
    }

    public String getItem_discount() {
        return item_discount;
    }

    public void setItem_discount(String item_discount) {
        this.item_discount = item_discount;
    }
}
