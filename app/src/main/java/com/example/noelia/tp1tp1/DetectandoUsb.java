package com.example.noelia.tp1tp1;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

import android.widget.Toast;

import androidx.core.app.ActivityCompat;

public class DetectandoUsb extends BroadcastReceiver {
private int bandera=0;
    @Override
    public void onReceive(Context context, Intent intent) {

        boolean b=intent.getExtras().getBoolean("connected");
            if(b && bandera==0){
                Toast.makeText(context, "Entre", Toast.LENGTH_LONG).show();
                bandera=1;
                Intent i=new Intent(context,segunda.class);
                context.startActivity(i);
            }
            else{
                bandera=0;
                Toast.makeText(context, "Desconectado", Toast.LENGTH_LONG).show();
            }
        }



    }

