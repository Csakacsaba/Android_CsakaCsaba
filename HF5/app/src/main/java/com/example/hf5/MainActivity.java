package com.example.hf5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    private ListView myList;
    private CustomAdapter adapter;
    private ArrayList<String> items;

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionts_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.sort) {
            Collections.sort(items);
            adapter.notifyDataSetChanged();
        } else if (id == R.id.delete) {
            adapter.clear();
        }
        return true;
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
        int position = info.position;
        int id = item.getItemId();

        View view = myList.getChildAt(position);
        TextView textView = view.findViewById(R.id.textView);

        if (id == R.id.piros) {
            textView.setTextColor(Color.RED);
        } else if (id == R.id.zold) {
            textView.setTextColor(Color.GREEN);
        } else if (id == R.id.sarga) {
            textView.setTextColor(Color.YELLOW);
        }
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myList = findViewById(R.id.myList);
        items = new ArrayList<>(Arrays.asList(
                "Octopus","Pig","Sheep","Rabbit",
                "Snake","ASpider","123Spider","XSpider","BSpider"
        ));
        adapter = new CustomAdapter(this, R.layout.list_item, items);
        myList.setAdapter(adapter);

        registerForContextMenu(myList);

    }
}
