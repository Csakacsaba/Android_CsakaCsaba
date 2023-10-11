package com.example.tablelayout2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText codeEditText;
    private EditText nameEditText;
    private EditText priceEditText;
    private TableLayout tableLayout;
    private List<Product> productList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        codeEditText = findViewById(R.id.code);
        nameEditText = findViewById(R.id.name);
        priceEditText = findViewById(R.id.price);
        tableLayout = findViewById(R.id.tableLayout);

        Button addButton = findViewById(R.id.addbutton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addProduct();
            }
        });

        Button cancelButton = findViewById(R.id.cancelButton);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearProducts();
            }
        });
    }

    private void addProduct() {
        String code = codeEditText.getText().toString();
        String name = nameEditText.getText().toString();
        String price = priceEditText.getText().toString();

        if (!code.isEmpty() && !name.isEmpty() && !price.isEmpty()) {
            Product product = new Product(code, name, price);
            productList.add(product);

            TableRow row = new TableRow(this);
            TextView codeView = new TextView(this);
            TextView nameView = new TextView(this);
            TextView priceView = new TextView(this);

            codeView.setText(code);
            nameView.setText(name);
            priceView.setText(price);

            codeView.setLayoutParams(new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 1f));
            nameView.setLayoutParams(new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 1f));
            priceView.setLayoutParams(new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 1f));

            row.addView(codeView);
            row.addView(nameView);
            row.addView(priceView);
            tableLayout.addView(row);

            codeEditText.getText().clear();
            nameEditText.getText().clear();
            priceEditText.getText().clear();
        }
    }


    private void clearProducts() {
        productList.clear();
        int childCount = tableLayout.getChildCount();
        for (int i = childCount - 1; i > 0; i--) {   //így örzi meg az első sort
            View child = tableLayout.getChildAt(i);
            if (child instanceof TableRow) {
                tableLayout.removeViewAt(i);
            }
        }
    }

}
