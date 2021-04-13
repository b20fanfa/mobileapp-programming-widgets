package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

//import android.widget.EditText;


//för knappen//
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //EditText search;
    Button FirstButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //search = (EditText) findViewById(R.id.myNewEdt);

        setContentView(R.layout.activity_main);
        FirstButton = (Button) findViewById(R.id.button1);//get id of button 1


        FirstButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Din information har sparats", Toast.LENGTH_LONG).show();//När användaren har klickat på knappen kommer denna mening upp.
            }
        });


    }


}


