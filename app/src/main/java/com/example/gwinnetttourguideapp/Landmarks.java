package com.example.gwinnetttourguideapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Landmarks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landmarks);

        //ArrayList that will be populated with data about each historical landmark
        ArrayList<Location> locations = new ArrayList<>();

        //This next code segment populates the ArrayList with data
        locations.add(new Location("Buford Dam", R.drawable.buforddam, "Buford Dam Rd, Buford, GA 30518", "https://www.nps.gov/places/buford-dam-place.htm"));
        locations.add(new Location("Gwinnett's Fallen Heroes Memorial", R.drawable.fallenheroes, "75 Langley Dr, Lawrenceville, GA 30046", "https://www.gwinnettcounty.com/web/gwinnett/aboutgwinnett/artsandentertainment/fallenheroesmemorial"));
        locations.add(new Location("Gwinnett Historic Courthouse", R.drawable.courthousee, "185 W Crogan St, Lawrenceville, GA 30046", "https://www.gwinnettcounty.com/web/gwinnett/departments/communityservices/parksandrecreation/ourparksandfacilities/guidetoyourparks/gwinnetthistoriccourthouse"));
        locations.add(new Location("Gwinnett History Museum", R.drawable.museum, "455 S Perry St, Lawrenceville, GA 30046", "https://www.gwinnettcounty.com/web/gwinnett/aboutgwinnett/artsandentertainment/historymuseum"));
        locations.add(new Location("Historic Downtown Norcross", R.drawable.historicdowntown, "27 S Peachtree St, Norcross, GA 30071", "https://www.norcrossga.net/920/Downtown-Norcross"));
        locations.add(new Location("Peachtree Corners Veteran Monument", R.drawable.peachtreeveterans, "5140 Town Center Blvd, Peachtree Corners, GA 30092", "https://ptcvets.net/"));
        locations.add(new Location("Stone Mountain", R.drawable.stonemountain, "1000 Robert E Lee Blvd, Stone Mountain, GA 30083", "https://www.stonemountainpark.com/"));

        //This creates a custom ArrayAdapter that populates the ListView in the activity_landmarks XML file with views containing the data in the locations ArrayList
        LocationAdapter adapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.LandmarksList);
        listView.setAdapter(adapter);
    }
}