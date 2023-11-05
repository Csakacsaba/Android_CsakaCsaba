package com.example.hf6;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hf6.Fragment1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add Fragment1 to the container
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new Fragment1())
                .commit();
    }
}
