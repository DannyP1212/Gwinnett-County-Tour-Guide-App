package com.example.gwinnetttourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView parks = (TextView) findViewById(R.id.Parks);

        parks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent parksIntent = new Intent(MainActivity.this, Parks.class);
                startActivity(parksIntent);
            }
        });

        TextView landmarks = (TextView) findViewById(R.id.Landmarks);

        landmarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent landmarksIntent = new Intent(MainActivity.this, Landmarks.class);
                startActivity(landmarksIntent);
            }
        });

        TextView shops = (TextView) findViewById(R.id.Shops);

        shops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shopsIntent = new Intent(MainActivity.this, Shops.class);
                startActivity(shopsIntent);
            }
        });

        TextView restaurants = (TextView) findViewById(R.id.Restaurants);

        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, Restaurants.class);
                startActivity(restaurantsIntent);
            }
        });
    }

}