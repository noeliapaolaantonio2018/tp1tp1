package com.example.noelia.tp1tp1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class DetectandoUsb extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Se ha detectado un dispositivo usb conectado", Toast.LENGTH_LONG).show();

    }
}
