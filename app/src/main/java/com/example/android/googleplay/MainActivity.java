package com.example.android.googleplay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView sectionRecyclerView = findViewById(R.id.recyclerview_main);
        sectionRecyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));
        sectionRecyclerView.setHasFixedSize(true);

        category = getResources().getStringArray(R.array.categories);

        ArrayList<SectionDataModel> sectionDataModels = getSectionListItems();

        SectionRecyclerViewAdapter sectionAdapter = new SectionRecyclerViewAdapter(this,
                sectionDataModels);

        sectionRecyclerView.setAdapter(sectionAdapter);
    }



    private ArrayList<SectionDataModel> getSectionListItems() {

        ArrayList<SectionDataModel> sectionDataModelArrayList = new ArrayList<>();

        for(int i=0; i<category.length; i++) {
            SectionDataModel dataModel = new SectionDataModel();
            dataModel.setSectionTitle(category[i]);

          dataModel.setSectionDataList(getItemList(category[i]));
            sectionDataModelArrayList.add(dataModel);
        }

        return  sectionDataModelArrayList;
    }



    private ArrayList<SingleItemModel> getItemList(String currentCategory) {


        ArrayList<SingleItemModel> singleItemList = new ArrayList<>();

        if (currentCategory.contains("Games") && currentCategory.contains("Updated")) {
            singleItemList = getGameApps(singleItemList);

        } else if (currentCategory.contains("Recent")) {
            singleItemList = getRecentActivityApps(singleItemList);

        } else if (currentCategory.contains("Recommended")) {
            singleItemList = getRecommendedApps(singleItemList);

        } else if (currentCategory.contains("Updated") && currentCategory.contains("Apps")) {
            singleItemList = getUpdatedApps(singleItemList);

        }



        return singleItemList;
    }

    private ArrayList<SingleItemModel> getGameApps(ArrayList<SingleItemModel> itemList) {

        itemList.add(new SingleItemModel(getString(R.string.candycrush), R.drawable.candycrushsaga,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.templerun2), R.drawable.templerun2,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.subwaysurfers), R.drawable.subwaysurfers,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.logoquizworld), R.drawable.logoquizworld,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.rivercrossing), R.drawable.rivercrossing,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.zenkoi2), R.drawable.zenkoi2,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.game2048), R.drawable.game2048,  new Random().nextInt(100)));

        return itemList;
    }


    private ArrayList<SingleItemModel> getRecentActivityApps(ArrayList<SingleItemModel> itemList) {

        itemList.add(new SingleItemModel(getString(R.string.trellotimetracker), R.drawable.trellotimetracker,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.udacity), R.drawable.udacity,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.sololearn), R.drawable.sololearn,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.slack), R.drawable.slack,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.kindle), R.drawable.kindle,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.amazon), R.drawable.amazon,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.makemytrip), R.drawable.makemytrip,  new Random().nextInt(100)));

        return itemList;
    }

    private ArrayList<SingleItemModel> getRecommendedApps(ArrayList<SingleItemModel> itemList) {

        itemList.add(new SingleItemModel(getString(R.string.tripadvisor), R.drawable.tripadvisor,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.productivitychallengetimer), R.drawable.productivitychallengetimer,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.googleplaybooks), R.drawable.googleplaybooks,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.stackoverflow), R.drawable.stackoverflow,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.hike), R.drawable.hike,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.youtube), R.drawable.youtube,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.pinterest), R.drawable.pinterest,  new Random().nextInt(100)));


        return itemList;
    }

    private ArrayList<SingleItemModel> getUpdatedApps(ArrayList<SingleItemModel> itemList) {

        itemList.add(new SingleItemModel(getString(R.string.instagram), R.drawable.instagram,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.olacabs), R.drawable.olacabs,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.googlemaps), R.drawable.googlemaps,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.logicmaster), R.drawable.logicmaster,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.duolingo), R.drawable.duolingo,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.camscanner), R.drawable.camscanner,  new Random().nextInt(100)));
        itemList.add(new SingleItemModel(getString(R.string.wordpress), R.drawable.wordpress,  new Random().nextInt(100)));


        return itemList;
    }
}
