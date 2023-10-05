package com.example.labor2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Status" , "MainActivity:onCreate");

        Button start = findViewById(R.id.btnStart);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(myIntent);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Status" , "MainActivity:onResart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Status" , "MainActivity:onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Status" , "MainActivity:onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Status" , "MainActivity:onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Status" , "MainActivity:onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Status" , "MainActivity:onDestroy");
    }
}