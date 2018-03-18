package com.example.android.googleplay;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by mahima on 18/3/18.
 */

public class SectionRecyclerViewAdapter extends RecyclerView.Adapter<SectionViewHolder> {

    ArrayList<SectionDataModel> sectionDataModelArrayList;
    Context context;

    public SectionRecyclerViewAdapter(Context context, ArrayList<SectionDataModel> sectionDataModels) {
        super();
        this.context = context;
        sectionDataModelArrayList = sectionDataModels;
    }

    @Override
    public SectionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View sectionLayout = LayoutInflater.from(context)
                .inflate(R.layout.section_card_item, parent, false);
        return new SectionViewHolder(context, sectionLayout);
    }

    @Override
    public void onBindViewHolder(SectionViewHolder holder, int position) {

        SectionDataModel sectionItem = sectionDataModelArrayList.get(position);
        holder.sectionTitle.setText(sectionItem.getSectionTitle());

        holder.appItemRecyclerView.setHasFixedSize(true);
        holder.appItemRecyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,
                false));
        holder.appItemRecyclerView.setAdapter(new ItemRecyclerViewAdapter(context, sectionItem.getSectionDataList()));
        SnapHelper helper = new LinearSnapHelper();
        helper.attachToRecyclerView(holder.appItemRecyclerView);

    }

    @Override
    public int getItemCount() {
        return sectionDataModelArrayList.size();
    }
}
