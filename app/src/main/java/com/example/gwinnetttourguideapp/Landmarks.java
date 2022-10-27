package com.example.gwinnetttourguideapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Landmarks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landmarks);

        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location("Buford Dam", R.drawable.buforddam));
        locations.add(new Location("Gwinnett's Fallen Heroes Memorial", R.drawable.fallenheroes));
        locations.add(new Location("Gwinnett Historic Courthouse", R.drawable.courthousee));
        locations.add(new Location("Gwinnett History Museum", R.drawable.museum));
        locations.add(new Location("Historic Downtown Norcross", R.drawable.historicdowntown));
        locations.add(new Location("Haralson Mill Covered Bridge", R.drawable.haralson));
        locations.add(new Location("Peachtree Corners Veteran Monument", R.drawable.peachtreeveterans));
        locations.add(new Location("Stone Mountain", R.drawable.stonemountain));

        LocationAdapter adapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.LandmarksList);
        listView.setAdapter(adapter);
    }
}