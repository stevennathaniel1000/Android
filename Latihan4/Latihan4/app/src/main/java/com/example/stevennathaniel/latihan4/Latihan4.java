package com.example.stevennathaniel.latihan4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class Latihan4 extends AppCompatActivity {

    EditText text3;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan4);

        text3=(EditText)findViewById(R.id.text3);
        button1=(Button)findViewById(R.id.button1);

    }

    public void onClick(View v){

        text3.setText("O android");
    }
}
