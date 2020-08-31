package com.example.noelia.tp1tp1;

import android.content.Intent;
import android.content.IntentFilter;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
private DetectandoUsb dusb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(dusb);

    }

    @Override
    protected void onResume() {
        super.onResume();
        dusb=new DetectandoUsb();
        registerReceiver(dusb, new IntentFilter("android.hardware.usb.action.USB_STATE"));

    }

}
