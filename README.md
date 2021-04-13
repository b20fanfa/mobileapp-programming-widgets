
# Rapport

Assignment 3 - Widgets


Först lades en <LinearLayout> in i Activity_main.XML. från <androidx.constraintlayout.widget.ConstraintLayout xmlns:android=”http://schemas.android.com/apk/res/android”.
Detta gjordes eftersom LinearLayout den är en enkel layout där man kan ordna/sätta/ designa med olika element i antingen horisontellt eller vertikal läge.

Sedan lades den första EditText in som innehöll lite text där det stod ”Skriv här” för att enkelt se hur det skulle se ut:

```
<EditText
android:id="@+id/myNewEdt"
android:hint="Skriv här"
android:layout_width="match_parent"
android:layout_height="wrap_content" />
```

Sedan lades en knapp, när användaren skrev in något där skulle det komma upp en ruta med en text där det stod "Din information har sparats”.
Detta var för att se hur allt fungerade.
I activity_main.XML lades en button tagg in, som fick id ”button1”: sedan kunde man använda layout som bestämde hur den skulle se ut .
Den fick en bakgrundsbild och en text där det stod ”Sumit” så att användaren lättare kunde se.

```
<Button
    android:id="@+id/button1"
    android:layout_width="300dp"
    android:layout_height="65dp"
    android:background="#A4A6AA"
    android:baselineAligned="false"
    android:text="submit"
    android:textSize="20sp" />
 ```


I filen MainActivity.java högst uppe måste var man tvungen lägga in själva funktionen button med hjälp av ”import android.widget.Button;”
Sedan innanför public class MainActivity extends AppCompatActivity { behövde man lägga in button och sedan deklarera den.

```
public class MainActivity extends AppCompatActivity {

    EditText name, lname, mail, date;
    Button FirstButton;
```

Efter det lades ännu fler layouter, så som EditText, TextView och ImageView.
Alla hade olika egenskaper.
EditText innehöll text där användaren skulle skriva in själv. I detta fall användes 4 stycken då det var, Name, Last Name, Email och Date. När användaren skrivit in detta så ska de trycka på knappen och det ska komma upp en ruta med deras information på.

För att göra detta möjlig skapades det ”If satser och else satser” innanför public void onClick(View v).

```
if (name.getText().toString().isEmpty() || lname.getText().toString().isEmpty() || mail.getText().toString().isEmpty() || date.getText().toString().isEmpty()){
    Toast.makeText(getApplicationContext(), "Enter the Data", Toast.LENGTH_SHORT).show();
}
else {
    Toast.makeText(getApplicationContext(), "Name -  " + name.getText().toString() + " \n" + "Last name -  " + lname.getText().toString()
            + " \n" + "E-Mail -  " + mail.getText().toString() + " \n" + "Date -  " + date.getText().toString()
            , Toast.LENGTH_SHORT).show();
}
```


 Sedan lades en ImageView in på en hund som placerades på sidan.

```
<ImageView
    android:id="@+id/imageView3"
    android:layout_width="150dp"
    android:layout_height="150dp"
    android:contentDescription="A dog "
    android:layout_marginLeft="120dp"
    android:layout_marginTop="20dp"
    app:srcCompat="@drawable/assignment3" />
 ```

TextView var en enkel text ruta där det stod ”Skriv här” för att göra det lättare.

```
<TextView
    android:layout_width="250dp"
    android:layout_height="30dp"
    android:text="Skriv här:"
    />
```


När det kommer till styling används olika tekniker. Hela filen activity_main.XML ligger allt innanför en <LinearLayout> tagg, men eftersom man kan ha LinearLayout innanför en till LinearLayout kan man skapa ”LinearLayout barn”. På så sätt kan man syle flera element samtidigt, som exempelvis vart den sak placeras utifrån kanterna osv.  I deras egna styling i element (”ImageView) fokuserar man mer på typsnitt, storlek på text och färger.
I detta fall ligger TextView och fyra stycken EditView innanför samma LinearLayout för att på ett enklare sätt style dem så de blir på samma sätt.


Bilder:
![] (info.png)
![] (svar.png)

