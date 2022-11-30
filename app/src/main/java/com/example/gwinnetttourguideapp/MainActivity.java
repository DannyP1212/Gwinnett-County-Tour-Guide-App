package com.example.gwinnetttourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    //Channel ID that is needed to create a notification
    private static final String CHANNEL_ID = "MyNotification";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createNotificationChannel();

        TextView parks = (TextView) findViewById(R.id.Parks);

        //Displays the activity containing parks when the user taps the "parks" TextView
        parks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent parksIntent = new Intent(MainActivity.this, Parks.class);
                startActivity(parksIntent);
            }
        });

        TextView landmarks = (TextView) findViewById(R.id.Landmarks);

        //Displays the activity containing historical landmarks when the user taps the "landmarks" TextView
        landmarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent landmarksIntent = new Intent(MainActivity.this, Landmarks.class);
                startActivity(landmarksIntent);
            }
        });

        TextView shops = (TextView) findViewById(R.id.Shops);

        //Displays the activity containing shopping centers when the user taps the "shops" TextView
        shops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shopsIntent = new Intent(MainActivity.this, Shops.class);
                startActivity(shopsIntent);
            }
        });

        TextView restaurants = (TextView) findViewById(R.id.Restaurants);

        //Displays the activity containing restaurants when the user taps the "restaurants" TextView
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, Restaurants.class);
                startActivity(restaurantsIntent);
            }
        });
    }

    //Creates a notification channel, which is necessary for notifications to work in higher versions of Android. Notifications are passed through here in order for them to be created.
    public void createNotificationChannel() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "Main Channel";
            String description = "This is the main notification channel";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
            channel.setDescription(description);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }

}