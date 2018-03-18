package com.example.android.googleplay;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * View Holder for each item in the horizontal recycler view within each card view - contains
 * app image, it's name and size
 */

public class ItemViewHolder extends RecyclerView.ViewHolder {

    ImageView appImage;
    TextView appTitle;
    TextView appSize;
    Context context;

    public ItemViewHolder(Context context, View itemView) {
        super(itemView);
        this.context = context;
        appImage = itemView.findViewById(R.id.app_image);
        appTitle = itemView.findViewById(R.id.app_title);
        appSize = itemView.findViewById(R.id.app_size);
    }
}
