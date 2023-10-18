package com.example.hf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView myList;
    Integer[] imageArray = {
            R.drawable.euro,
            R.drawable.unitedstates,
            R.drawable.unitedkingdom,
            R.drawable.australia,
            R.drawable.canada,
            R.drawable.switzerland,
            R.drawable.denmark,
            R.drawable.hungary,
    };

    String[] short_nameArray = {
            "EUR",
            "USD",
            "GBP",
            "AUD",
            "CAD",
            "CHF",
            "DFF",
            "HUF"
    };

    String[] full_nameArray = {
            "Euro",
            "Dollar American",
            "Liria sterlina",
            "Dollar Australian",
            "Dollar canadian",
            "Franc Elvetian",
            "Corona Daneza",
            "Forint Maghiar",
    };

    String[] buy_priceArray = {
        "4,4100 RON",
        "3,9750 RON",
        "6,1250 RON",
        "2,9600 RON",
        "3,0950 RON",
        "4,2300 RON",
        "0,5850 RON",
        "0,0136 RON",
    };

    String[] sell_priceArray = {
        "4,5500 RON",
        "4,1450 RON",
        "6,3550 RON",
        "3,0600 RON",
        "3,2650 RON",
        "4,3300 RON",
        "0,6150 RON",
        "0,0146 RON",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myList = findViewById(R.id.myList);
        CustomListViewAdapter egyszeruAdapter = new CustomListViewAdapter(this, imageArray, short_nameArray, full_nameArray, buy_priceArray, sell_priceArray);
        myList.setAdapter(egyszeruAdapter);


    }
}