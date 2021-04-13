package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.EditText;


//för knappen//
import android.widget.Button;
//import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    EditText name, lname, mail, date;
    Button FirstButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.edit_text_name);
        lname = (EditText) findViewById(R.id.edit_text_last_name);
        mail = (EditText) findViewById(R.id.edit_text_email);
        date = (EditText) findViewById(R.id.edit_text_date);

        FirstButton = (Button) findViewById(R.id.button1);

        FirstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().isEmpty() || lname.getText().toString().isEmpty() || mail.getText().toString().isEmpty() || date.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Enter the Data", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Name -  " + name.getText().toString() + " \n" + "Last name -  " + lname.getText().toString()
                            + " \n" + "E-Mail -  " + mail.getText().toString() + " \n" + "Date -  " + date.getText().toString()
                            , Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}



