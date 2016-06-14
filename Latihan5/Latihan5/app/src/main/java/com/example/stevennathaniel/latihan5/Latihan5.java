package com.example.stevennathaniel.latihan5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Latihan5 extends AppCompatActivity {

    private EditText edittext1,edittext2;
    private Button buttonSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan5);

        addListenerOnButton();
    }

    public void addListenerOnButton(){
        edittext1=(EditText)findViewById(R.id.editText1);
        edittext2 =(EditText)findViewById(R.id.editText2);

        buttonSum=(Button)findViewById(R.id.button1);


        buttonSum.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View view) {
                String value1=edittext1.getText().toString();
                String value2=edittext2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sum=a+b;

                Toast.makeText(getApplicationContext(),String.valueOf(sum),Toast.LENGTH_LONG).show();

            }
        });
    }

    /*@Override
    *//*public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items ti the action bar if it is present
        getMenuInflater().inflate(R., menu);
        return true;*/
    }


