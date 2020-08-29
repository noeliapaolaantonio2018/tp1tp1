package com.example.noelia.tp1tp1;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
private DetectandoUsb dusb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        unregisterReceiver(dusb);
        super.onPause();
    }

    @Override
    protected void onResume() {
        dusb=new DetectandoUsb();
        registerReceiver(dusb, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));
        super.onResume();
    }
    public void enviarSiguiente(View v){
        Intent i=new Intent(this,segunda.class);
        i.putExtra("llamando al ","911");
        startActivity(i);


    }
}
