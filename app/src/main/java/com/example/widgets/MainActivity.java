package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.EditText;


//för knappen//
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    EditText name, lname, mail, date ;
    Button FirstButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //name = (EditText) findViewById(R.id.edit_text_name);
        //lname = (EditText) findViewById(R.id.edit_text_last_name);
        //mail = (EditText) findViewById(R.id.edit_text_email);
        //date = (EditText) findViewById(R.id.edit_text_date);

        //FirstButton = (Button) findViewById(R.id.button1);


      //  FirstButton.setOnClickListener(new View.OnClickListener() {

          //  @Override
          //  public void onClick(View view) {
          //      Toast.makeText(getApplicationContext(), "Din information har sparats", Toast.LENGTH_LONG).show();//När användaren har klickat på knappen kommer denna mening upp.
         //   }
       // });


//    }


//}

//Här hag jag försökt att få upp information från användaren när de skriver in!!!
        final EditText edit_text_name = (EditText) findViewById(R.id.edit_text_name);//get the id for edit text
        final EditText edit_text_last_name = (EditText) findViewById(R.id.edit_text_last_name);
        final EditText edit_text_email = (EditText) findViewById(R.id.edit_text_email);
        final EditText edit_text_date = (EditText) findViewById(R.id.edit_text_date);

        Button button1 = (Button) findViewById(R.id.button1);//get the id for button
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit_text_name.getText().toString() != null)//check whether the entered text is not null
                {
                    Toast.makeText(getApplicationContext(), edit_text_name.getText().toString(), Toast.LENGTH_LONG).show();//display the text that you entered in edit text
                }

                if (edit_text_last_name.getText().toString() != null)//check whether the entered text is not null
                {
                    Toast.makeText(getApplicationContext(), edit_text_last_name.getText().toString(), Toast.LENGTH_LONG).show();//display the text that you entered in edit text
                }

                if (edit_text_email.getText().toString() != null)//check whether the entered text is not null
                {
                    Toast.makeText(getApplicationContext(),edit_text_email .getText().toString(), Toast.LENGTH_LONG).show();//display the text that you entered in edit text
                }

            }
        });
    }


}

