package com.example.stevennathaniel.latihan3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;

public class Latihan3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        // akan menyembunyikan title bukannya title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        // code that displays the content in full screen mode
        // int flag, int mask
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_latihan3);
    }
}
