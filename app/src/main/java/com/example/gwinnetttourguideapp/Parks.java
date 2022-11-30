package com.example.gwinnetttourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Parks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parks);

        //ArrayList that will be populated with data about each park
        ArrayList<Location> locations = new ArrayList<>();

        //This next code segment populates the ArrayList with data
        locations.add(new Location("Alexander Park", R.drawable.alexander, "800 Old Snellville Hwy, Lawrenceville, GA 30044"));
        locations.add(new Location("Bay Creek Park", R.drawable.baycreek, "175 Ozora Rd, Loganville, GA 30052"));
        locations.add(new Location("Collins Hill Park", R.drawable.collins, "2225 Collins Hill Rd, Lawrenceville, GA 30043"));
        locations.add(new Location("Dacula Park", R.drawable.daculapark, "205 Dacula Rd, Dacula, GA 30019"));
        locations.add(new Location("Freeman's Mill Park", R.drawable.freemansmill, "1401 Alcovy Rd SE, Lawrenceville, GA 30045"));
        locations.add(new Location("Harmony Grove Soccer Complex", R.drawable.harmonygrove, "119 Harmony Grove Rd, Lilburn, GA 30047"));
        locations.add(new Location("Lucky Shoals Park", R.drawable.luckyshoals, "4651 Britt Rd, Norcross, GA 30093"));
        locations.add(new Location("McDaniel Farm Park", R.drawable.mcdaniel, "3251 McDaniel Rd, Duluth, GA 30096"));
        locations.add(new Location("Rock Springs Park", R.drawable.rocksprings, "550 Rock Springs Rd, Lawrenceville, GA 30043"));
        locations.add(new Location("Tribble Mill Park", R.drawable.tribblemill, "2125 Tribble Mill Pkwy SE, Lawrenceville, GA 30045"));

        //This creates a custom ArrayAdapter that populates the ListView in the activity_parks XML file with views containing the data in the locations ArrayList
        LocationAdapter adapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.ParksList);
        listView.setAdapter(adapter);

    }

}