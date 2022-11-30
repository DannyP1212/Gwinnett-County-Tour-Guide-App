package com.example.gwinnetttourguideapp;

//This class is used to store data for each location.

public class Location {
    //Declares the variables used by the locations
    private String name;
    private int image;
    private String address;
    private String website;
    private String restaurantType;
    private boolean hasWebsite;
    private boolean isRestaurant;
    private boolean isShop;
    private boolean isPark;
    private boolean isHistorical;

    //The constructor used to instantiate Location variables for Parks
    public Location(String mName, int mImage, String mAddress) {
        name = mName;
        image = mImage;
        address = mAddress;
        hasWebsite = false;
        isRestaurant = false;
        isShop = false;
        isPark = true;
        isHistorical = false;
    }

    //The constructor used to instantiate Location variables for Restaurants
    public Location(String mName, int mImage, String mAddress, String mWebsite, String mRestaurantType) {
        name = mName;
        image = mImage;
        address = mAddress;
        website = mWebsite;
        restaurantType = mRestaurantType;
        hasWebsite = true;
        isRestaurant = true;
        isShop = false;
        isPark = false;
        isHistorical = false;
    }

    //The constructor used to instantiate Location variables for Historic Landmarks
    public Location(String mName, int mImage, String mAddress, String mWebsite) {
        name = mName;
        image = mImage;
        address = mAddress;
        website = mWebsite;
        hasWebsite = true;
        isRestaurant = false;
    }

    //The constructor used to instantiate Location variables for Shopping Centers
    public Location(String mName, int mImage, String mAddress, String mWebsite, Boolean mBoolean) {
        name = mName;
        image = mImage;
        address = mAddress;
        website = mWebsite;
        hasWebsite = true;
        isRestaurant = false;
        isHistorical = false;
        isPark = false;
        isShop = true;
    }

    //Getter methods for each variable are listed below

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getAddress() {return address;}

    public String getWebsite() {return website;}

    public String getRestaurantType() {return restaurantType;}

    public boolean getHasWebsite() {
        return hasWebsite;
    }

    public boolean getIsRestaurant() {
        return isRestaurant;
    }

    public boolean getIsPark() {
        return isPark;
    }

    public boolean getIsHistorical() {
        return isHistorical;
    }

    public boolean getIsShop() {
        return isShop;
    }
}
