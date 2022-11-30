package com.example.gwinnetttourguideapp;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import androidx.core.app.NotificationCompat;

public class NotificationMaker {

    public NotificationMaker() {
    }

    //This helper method contains the code necessary to create a notification
    public static void setNotification(Context context, String notificationTitle, String notificationMessage, int notificationRequestCode) {
        //This segment is used to just create the notification with the given inputs
        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(context, "MyNotification")
                        .setSmallIcon(R.drawable.notification_icon)
                        .setContentTitle(notificationTitle)
                        .setContentText(notificationMessage)
                        .setAutoCancel(true);

        //These next 3 lines create and activate an intent that actually sends the notification
        Intent intent = new Intent(context, MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(context, notificationRequestCode, intent, PendingIntent.FLAG_IMMUTABLE);
        builder.setContentIntent(contentIntent);

        NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());
    }
}
