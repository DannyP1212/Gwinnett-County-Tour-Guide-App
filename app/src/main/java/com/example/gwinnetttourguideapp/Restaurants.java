package com.example.gwinnetttourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location("The Cheesecake Factory", R.drawable.cheesecake));
        locations.add(new Location("Grandma's New York Pizza", R.drawable.grandmapizza));
        locations.add(new Location("Off the Hook Fish & Shrimp", R.drawable.offthehook));
        locations.add(new Location("The Peachtree Cafe", R.drawable.peachtreecafe));
        locations.add(new Location("Shogun Steakhouse, Seafood, & Sushi", R.drawable.shogunn));
        locations.add(new Location("Steak 'n Shake", R.drawable.steaknshake));
        locations.add(new Location("Super Golden Buffet", R.drawable.supergolden));
        locations.add(new Location("Taco Mac", R.drawable.tacomac));

        LocationAdapter adapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.RestaurantsList);
        listView.setAdapter(adapter);
    }
}