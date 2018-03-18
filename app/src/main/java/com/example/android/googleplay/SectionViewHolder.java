package com.example.android.googleplay;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by mahima on 18/3/18.
 */

public class SectionViewHolder extends RecyclerView.ViewHolder {

    TextView sectionTitle;
    RecyclerView appItemRecyclerView;
    Context context;

    public SectionViewHolder(Context context, View itemView) {
        super(itemView);
        this.context = context;
        sectionTitle = itemView.findViewById(R.id.section_title);
        appItemRecyclerView = itemView.findViewById(R.id.recyclerview_section);
    }
}
