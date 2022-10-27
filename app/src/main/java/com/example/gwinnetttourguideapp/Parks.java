package com.example.gwinnetttourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Parks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parks);

        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location("Alexander Park", R.drawable.alexander));
        locations.add(new Location("Bay Creek Park", R.drawable.baycreek));
        locations.add(new Location("Collins Hill Park", R.drawable.collins));
        locations.add(new Location("Dacula Park", R.drawable.daculapark));
        locations.add(new Location("Freeman's Mill Park", R.drawable.freemansmill));
        locations.add(new Location("Harmony Grove Soccer Complex", R.drawable.harmonygrove));
        locations.add(new Location("Lucky Shoals Park", R.drawable.luckyshoals));
        locations.add(new Location("McDaniel Farm Park", R.drawable.mcdaniel));
        locations.add(new Location("Rock Springs Park", R.drawable.rocksprings));
        locations.add(new Location("Tribble Mill Park", R.drawable.tribblemill));

        LocationAdapter adapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.ParksList);
        listView.setAdapter(adapter);
    }
}