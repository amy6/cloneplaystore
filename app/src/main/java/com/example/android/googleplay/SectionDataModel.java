package com.example.android.googleplay;

import java.util.ArrayList;

/**
 * Defines the list of items to be displayed in each category in a single page - it contains
 * a section header and the list of items corresponding to the section
 */

public class SectionDataModel {

    private String sectionTitle;
    private ArrayList<SingleItemModel> sectionDataList;

    public String getSectionTitle() {
        return sectionTitle;
    }

    public void setSectionTitle(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    public ArrayList<SingleItemModel> getSectionDataList() {
        return sectionDataList;
    }

    public void setSectionDataList(ArrayList<SingleItemModel> sectionDataList) {
        this.sectionDataList = sectionDataList;
    }
}
