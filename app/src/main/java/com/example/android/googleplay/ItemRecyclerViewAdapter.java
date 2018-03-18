package com.example.android.googleplay;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by mahima on 18/3/18.
 */

public class ItemRecyclerViewAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    ArrayList<SingleItemModel> appItemList;
    Context context;

    public ItemRecyclerViewAdapter(Context context, ArrayList<SingleItemModel> singleItemModelArrayList) {
        super();
        this.context = context;
        appItemList = singleItemModelArrayList;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View individualItemLayout = LayoutInflater.from(context)
                .inflate(R.layout.individual_category_item, parent, false);
        return new ItemViewHolder(context, individualItemLayout);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {

        SingleItemModel individualItem = appItemList.get(position);
        holder.appImage.setBackgroundResource(individualItem.getImageId());
        holder.appTitle.setText(individualItem.getAppName());
        String size = String.valueOf(individualItem.getAppSize())
                + context.getResources().getString(R.string.mb);
        holder.appSize.setText(size);

    }

    @Override
    public int getItemCount() {
        return appItemList.size();
    }
}
