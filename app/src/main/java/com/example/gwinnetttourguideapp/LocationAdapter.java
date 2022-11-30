package com.example.gwinnetttourguideapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {
    public LocationAdapter(Activity context, ArrayList<Location> locationList) {
        super(context, 0, locationList);
    }

    //This method will populate a layout that copies that list_item XML file with information from the locations ArrayList when a LocationAdapter is created in another activity
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //View that will contain data from list_item.xml
        View listItemView = convertView;

        //Populates listItemView with the default XML views in the list_item.xml file if the view is not yet populated
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Stores the Location variable at a certain position from the locations ArrayList
        Location currentLocation = getItem(position);

        //Stores the image of the current location variable in the ImageView of list_item.xml
        ImageView appImage = (ImageView) listItemView.findViewById(R.id.ImageOfPlace);
        appImage.setImageResource(currentLocation.getImage());

        //Stores the name of the current location variable in the corresponding TextView of list_item.xml
        TextView appText = (TextView) listItemView.findViewById(R.id.TextForPlace);
        appText.setText(currentLocation.getName());

        //Stores the address of the current location variable in the corresponding TextView of list_item.xml
        TextView addressText = (TextView) listItemView.findViewById(R.id.AddressText);
        addressText.setText("Address: " + currentLocation.getAddress());

        //Stores the website of the current location variable in the corresponding TextView of list_item.xml only if the Location variable that is input contains a website
        TextView websiteText = (TextView) listItemView.findViewById(R.id.WebsiteText);
        if(currentLocation.getHasWebsite()) {
            websiteText.setText("Website: " + currentLocation.getWebsite());
            websiteText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(!(currentLocation.getWebsite().equals("N/A"))) {
                        //Creates and activates an intent that opens an internet browser with a given URL
                        getContext().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(currentLocation.getWebsite())));
                        websiteText.setTextColor(Color.parseColor("#795CB2"));
                    }
                }
            });
        }

        //Stores the restaurant type of the current location variable into the corresponding TextView of list_item.xml only if the location variable is for a restaurant
        TextView restaurantTypeText = (TextView) listItemView.findViewById(R.id.RestaurantTypeText);
        if(currentLocation.getIsRestaurant()) {
            restaurantTypeText.setText("Restaurant Type: " + currentLocation.getRestaurantType());
        }

        //Creates an onClickListener for a more information button. Sets the views containing this information to visible only when the button is clicked.
        Button moreInfoButton = (Button) listItemView.findViewById(R.id.MoreInfo);
        moreInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(addressText.getVisibility() == View.GONE) {
                    addressText.setVisibility(View.VISIBLE);
                    moreInfoButton.setText("Hide Information");

                    if (currentLocation.getHasWebsite()) {
                        websiteText.setVisibility(View.VISIBLE);
                    }

                    if (currentLocation.getIsRestaurant()) {
                        restaurantTypeText.setVisibility(View.VISIBLE);
                    }
                }

                else {
                    moreInfoButton.setText("More Information");
                    addressText.setVisibility(View.GONE);

                    if (currentLocation.getHasWebsite()) {
                        websiteText.setVisibility(View.GONE);
                    }

                    if (currentLocation.getIsRestaurant()) {
                        restaurantTypeText.setVisibility(View.GONE);
                    }
                }

            }
        });

        //Reverts the press of the more information button when the view in which the button was pressed goes off screen.
        if(!(listItemView.isShown())) {
            addressText.setVisibility(View.GONE);
            websiteText.setVisibility(View.GONE);
            restaurantTypeText.setVisibility(View.GONE);
        }

        //Creates a notification with the name of a specific location when the reminder button is pressed.
        Button reminderButton = (Button) listItemView.findViewById(R.id.Reminder);
        final int id = 0;
        reminderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationMaker a = new NotificationMaker();
                a.setNotification(getContext(), "Location: " + currentLocation.getName(), "This is a reminder that you selected " + currentLocation.getName(), 0);
                Toast toast = Toast.makeText(getContext(), "Reminder Created", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        //Sets the color of the More Information and Reminder buttons based on the type of Location
        if(currentLocation.getIsPark()) {
            moreInfoButton.setBackgroundColor(Color.parseColor("#538052"));
            reminderButton.setBackgroundColor(Color.parseColor("#538052"));
        }
        else if(currentLocation.getIsRestaurant()) {
            moreInfoButton.setBackgroundColor(Color.parseColor("#96484c"));
            reminderButton.setBackgroundColor(Color.parseColor("#96484c"));
        }
        else if(currentLocation.getIsShop()) {
            moreInfoButton.setBackgroundColor(Color.parseColor("#5a4f82"));
            reminderButton.setBackgroundColor(Color.parseColor("#5a4f82"));
        }
        else {
            moreInfoButton.setBackgroundColor(Color.parseColor("#9c9865"));
            reminderButton.setBackgroundColor(Color.parseColor("#9c9865"));
        }

        return listItemView;
    }

}
