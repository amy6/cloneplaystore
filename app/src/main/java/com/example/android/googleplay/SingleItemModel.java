package com.example.android.googleplay;

/**
 * Corresponds to every item in the cards in the PlayStore displaying an image for the app
 * and it's name
 */

public class SingleItemModel {

    private String appName;
    private int imageId;
    private int appSize;

    public SingleItemModel(String name, int imageResource, int size) {
        appName = name;
        imageId = imageResource;
        appSize = size;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getAppSize() {
        return appSize;
    }

    public void setAppSize(int appSize) {
        this.appSize = appSize;
    }
}
