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

        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location("The Forum Peachtree Corners", R.drawable.theforum));
        locations.add(new Location("Lawrenceville Market", R.drawable.lawrencevillemarket));
        locations.add(new Location("Mall of Georgia", R.drawable.mallofgeorgia));
        locations.add(new Location("Marketplace at Mill Creek", R.drawable.marketplace));
        locations.add(new Location("Peachtree Corners Town Center", R.drawable.peachtreetowncenter));
        locations.add(new Location("Santa Fe Mall", R.drawable.santafe));
        locations.add(new Location("The Shoppes at Webb Gin", R.drawable.theshoppes));
        locations.add(new Location("Sugarloaf Mills", R.drawable.sugarloaf));

        LocationAdapter adapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.ShopsList);
        listView.setAdapter(adapter);
    }
}