package com.example.gwinnetttourguideapp;

public class Location {
    private String name;
    private int image;

    public Location(String mName, int mImage) {
        name = mName;
        image = mImage;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }
}
