package com.example.weking.materialtest;

/**
 * Created by weking on 2017/9/9.
 */

public class Fruit {

    private String name;

    private int imageId;

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public  int getImageId() {
        return imageId;
    }
}
