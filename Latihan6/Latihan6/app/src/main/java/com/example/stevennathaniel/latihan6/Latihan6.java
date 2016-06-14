package com.example.stevennathaniel.latihan6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class Latihan6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan6);

        // Menampilkan Toast dengan sebuah pesan

        Toast.makeText(getApplicationContext(),"Anda Berhasil",Toast.LENGTH_SHORT).show();;
    }

   /* @Override
    public boolean onCreateOptionMenu(Menu menu){

        getMenuInflater().inflate(R.menu.activity_latihan6, menu);
        return true;*/
    }

