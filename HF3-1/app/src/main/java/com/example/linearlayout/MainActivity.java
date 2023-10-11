package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mehet = findViewById(R.id.mehet);
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);

        mehet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class );
                    intent.putExtra("email", email.getText().toString());
                    startActivity(intent);
                }
            }
        });

    }
}