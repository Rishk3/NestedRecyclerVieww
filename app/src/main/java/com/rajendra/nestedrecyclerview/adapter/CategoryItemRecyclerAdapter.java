package com.rajendra.nestedrecyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.rajendra.nestedrecyclerview.R;
import com.rajendra.nestedrecyclerview.model.CategoryItem;

import java.util.List;

public class CategoryItemRecyclerAdapter extends RecyclerView.Adapter<CategoryItemRecyclerAdapter.CategoryItemViewHolder> {

    private Context context;
    private List<CategoryItem> categoryItemList;

    public CategoryItemRecyclerAdapter(Context context, List<CategoryItem> categoryItemList) {
        this.context = context;
        this.categoryItemList = categoryItemList;
    }

    @NonNull
    @Override
    public CategoryItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CategoryItemViewHolder(LayoutInflater.from(context).inflate(R.layout.category_row_items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryItemViewHolder holder, int position) {
            holder.itemImage.setImageResource(categoryItemList.get(position).getImageUrl());
            holder.productName.setText(categoryItemList.get(position).getProduct_name());
            holder.itemOriginalPrice.setText(categoryItemList.get(position).getItem_original_price());
            holder.itemNewprice.setText(categoryItemList.get(position).getItem_new_price());
            holder.discount.setText(categoryItemList.get(position).getItem_discount());

    }

    @Override
    public int getItemCount() {
        return categoryItemList.size();
    }

    public static final class CategoryItemViewHolder extends RecyclerView.ViewHolder{

        ImageView itemImage;
        TextView productName;
        TextView itemOriginalPrice;
        TextView itemNewprice;
        TextView discount;


        public CategoryItemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.item_image);
             productName=itemView.findViewById(R.id.product_name);
             itemOriginalPrice=itemView.findViewById(R.id.original_price);
             itemNewprice=itemView.findViewById(R.id.new_price);
             discount=itemView.findViewById(R.id.discount);
        }
    }

}
