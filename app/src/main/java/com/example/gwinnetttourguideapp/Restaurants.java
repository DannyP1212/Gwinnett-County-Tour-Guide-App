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

        //ArrayList that will be populated with data about each restaurant
        ArrayList<Location> locations = new ArrayList<>();

        //This next code segment populates the ArrayList with data
        locations.add(new Location("The Cheesecake Factory", R.drawable.cheesecake, "3333 Buford Dr, Buford, GA 30519", "https://www.thecheesecakefactory.com/", "Variety"));
        locations.add(new Location("Grandma's New York Pizza", R.drawable.grandmapizza, "911 Duluth Highway 120 Suite E3, Lawrenceville, GA 30043", "https://slicelife.com/restaurants/ga/lawrenceville/30043/grandma-s-ny-pizza-pasta/menu?utm_source=gmb_menu", "Pizza & Pasta"));
        locations.add(new Location("Off the Hook Fish & Shrimp", R.drawable.offthehook, "1002 Duluth Hwy #400, Lawrenceville, GA 30043", "https://www.offthehookfishandshrimp.com/", "Seafood"));
        locations.add(new Location("The Peachtree Cafe", R.drawable.peachtreecafe, "30 S Clayton St Suite 200, Lawrenceville, GA 30046", "https://www.peachtree-cafe.com/", "Breakfast"));
        locations.add(new Location("Shogun Steakhouse, Seafood, & Sushi", R.drawable.shogunn, "860 Duluth Hwy # 1400, Lawrenceville, GA 30043", "https://www.lawrencevilleshogun.com/", "Hibachi"));
        locations.add(new Location("Steak 'n Shake", R.drawable.steaknshake, "820 Lawrenceville-Suwanee Rd, Lawrenceville, GA 30043", "https://www.steaknshake.com/", "American"));
        locations.add(new Location("Super Golden Buffet", R.drawable.supergolden, "2155 Riverside Pkwy, Lawrenceville, GA 30043", "https://www.supergoldenbuffet.com/", "Buffet"));
        locations.add(new Location("Taco Mac", R.drawable.tacomac, "835 Lawrenceville-Suwanee Rd, Lawrenceville, GA 30043", "https://www.tacomac.com/", "Grill"));

        //This creates a custom ArrayAdapter that populates the ListView in the activity_restaurants XML file with views containing the data in the locations ArrayList
        LocationAdapter adapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.RestaurantsList);
        listView.setAdapter(adapter);
    }
}