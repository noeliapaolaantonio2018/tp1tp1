package com.example.noelia.tp1tp1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class segunda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void enviarSiguiente(View v){
        Intent i=new Intent(this,segunda.class);
        i.putExtra("llamando","911");
        startActivity(i);


    }
}
