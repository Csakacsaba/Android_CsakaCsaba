package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plus = findViewById(R.id.plusbutton);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText aEditText = findViewById(R.id.inputnum1);
                EditText bEditText = findViewById(R.id.inputnum2);

                String aText = aEditText.getText().toString();
                String bText = bEditText.getText().toString();

                int a = Integer.parseInt(aText);
                int b = Integer.parseInt(bText);

                int eredmeny = a + b;
                TextView myTextView = findViewById(R.id.egal);
                myTextView.setText(String.valueOf(eredmeny));


                Toast.makeText(MainActivity.this, "Az Ä‚Â¶sszeadÄ‚Ë‡s megtÄ‚Â¶rtÄ‚Â©nt", Toast.LENGTH_SHORT).show();
            }
        });


        Button minus = findViewById(R.id.minusbutton);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText aEditText = findViewById(R.id.inputnum1);
                EditText bEditText = findViewById(R.id.inputnum2);

                String aText = aEditText.getText().toString();
                String bText = bEditText.getText().toString();

                int a = Integer.parseInt(aText);
                int b = Integer.parseInt(bText);

                int eredmeny = b - a;


                TextView myTextView = findViewById(R.id.egal);
                myTextView.setText(String.valueOf(eredmeny));


                Toast.makeText(MainActivity.this, "A kivonÄ‚Ë‡s megtÄ‚Â¶rtÄ‚Â©nt", Toast.LENGTH_SHORT).show();
            }
        });

        Button multiplication = findViewById(R.id.multiplicationbutton);
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText aEditText = findViewById(R.id.inputnum1);
                EditText bEditText = findViewById(R.id.inputnum2);

                String aText = aEditText.getText().toString();
                String bText = bEditText.getText().toString();

                float a = Float.parseFloat(aText);
                float b = Float.parseFloat(bText);

                float eredmeny = a * b;

                TextView myTextView = findViewById(R.id.egal);
                myTextView.setText(String.valueOf(eredmeny));


                Toast.makeText(MainActivity.this, "A szorzÄ‚Ë‡s megtÄ‚Â¶rtÄ‚Â©nt", Toast.LENGTH_SHORT).show();
            }
        });

        Button division = findViewById(R.id.divisionbutton);
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText aEditText = findViewById(R.id.inputnum1);
                EditText bEditText = findViewById(R.id.inputnum2);

                String aText = aEditText.getText().toString();
                String bText = bEditText.getText().toString();

                float a = Float.parseFloat(aText);
                float b = Float.parseFloat(bText);

                if (a > 0) {
                    float eredmeny = a / b;
                    TextView myTextView = findViewById(R.id.egal);
                    myTextView.setText(String.valueOf(eredmeny));
                    Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, "Az osztÄ‚Ë‡s megtÄ‚Â¶rtÄ‚Â©nt", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Nullaval nem lehet osztani", Toast.LENGTH_SHORT).show();
                }


            }
        });



    }
}