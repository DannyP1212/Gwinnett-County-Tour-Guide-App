package com.example.gwinnetttourguideapp;

import android.app.Activity;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {
    public LocationAdapter(Activity context, ArrayList<Location> locationList) {
        super(context, 0, locationList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);

        ImageView appImage = (ImageView) listItemView.findViewById(R.id.ImageOfPlace);
        appImage.setImageResource(currentLocation.getImage());

        TextView appText = (TextView) listItemView.findViewById(R.id.TextForPlace);
        appText.setText(currentLocation.getName());

        return listItemView;
    }
}
