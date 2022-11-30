package com.example.gwinnetttourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Shops extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shops);

        //ArrayList that will be populated with data about each shopping center
        ArrayList<Location> locations = new ArrayList<>();

        //This next code segment populates the ArrayList with data
        locations.add(new Location("The Forum at Peachtree Corners", R.drawable.theforum, "5155 Peachtree Pkwy, Peachtree Corners, GA 30092", "https://theforumpeachtree.com/", true));
        locations.add(new Location("Lawrenceville Market", R.drawable.lawrencevillemarket, "Lawrenceville-Suwanee Rd, Lawrenceville, GA 30043", "https://www.mallsinamerica.com/georgia/lawrenceville-market", true));
        locations.add(new Location("Mall of Georgia", R.drawable.mallofgeorgia, "3333 Buford Dr, Buford, GA 30519", "https://www.simon.com/mall/mall-of-georgia", true));
        locations.add(new Location("Marketplace at Mill Creek", R.drawable.marketplace, "3118 Buford Dr, Buford, GA 30519", "https://marketplaceatmillcreek.com/", true));
        locations.add(new Location("Peachtree Corners Town Center", R.drawable.peachtreetowncenter, "5200 Town Center Blvd, Peachtree Corners, GA 30092", "https://ptreecornerstowncenter.com/", true));
        locations.add(new Location("Santa Fe Mall", R.drawable.santafe, "3750 Venture Dr, Duluth, GA 30096", "N/A", true));
        locations.add(new Location("The Shoppes at Webb Gin", R.drawable.theshoppes, "1350 Scenic Hwy S, Snellville, GA 30078", "https://www.theshoppesatwebbgin.com/", true));
        locations.add(new Location("Sugarloaf Mills", R.drawable.sugarloaf, "5900 Sugarloaf Pkwy, Lawrenceville, GA 30043", "https://www.simon.com/mall/sugarloaf-mills", true));

        //This creates a custom ArrayAdapter that populates the ListView in the activity_landmarks XML file with views containing the data in the locations ArrayList
        LocationAdapter adapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.ShopsList);
        listView.setAdapter(adapter);
    }
}