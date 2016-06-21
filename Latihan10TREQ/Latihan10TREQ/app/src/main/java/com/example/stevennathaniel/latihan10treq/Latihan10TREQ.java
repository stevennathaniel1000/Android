package com.example.stevennathaniel.latihan10treq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import android.content.*;



public class Latihan10TREQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan10_treq);
        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick(){

        //Getting instance of CheckBoxes and Button from the activity_latihan10_treq.xml file

     final CheckBox pizza=(CheckBox)findViewById(R.id.checkBox1);
      final CheckBox  coffee=(CheckBox)findViewById(R.id.checkBox2);
      final CheckBox burger=(CheckBox)findViewById(R.id.checkBox3);
      final Button  buttonOrder=(Button)findViewById(R.id.button1);

        // Applying the Listener on the Button click

        buttonOrder.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                int totalamount=0;
                StringBuilder result=new StringBuilder();
                result.append("Selected Items: ");
                if(pizza.isChecked()) {
                    result.append("\nPizza 100Rs");
                    totalamount+=100;
                }

                if(coffee.isChecked()) {
                    result.append("\nCoffee 50Rs");
                    totalamount+=50;
                }

                if(burger.isChecked()) {
                    result.append("\nBurger 120Rs");
                    totalamount+=120;
                }

                result.append("\nTotal: "+totalamount+"Rs");
                // Displaying the message on the toast
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }


}
