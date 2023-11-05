package com.example.hf6;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListViewAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final Integer[] imageIDarray;
    private final String[] short_nameArray;
    private final String[] full_nameArray;
    private final String[] buy_priceArray;
    private final String[] sell_priceArray;

    public CustomListViewAdapter(
            Activity context,
            Integer[] imageIDarrayParam,
            String[] shortNameArrayParam,
            String[] fullNameArrayParam,
            String[] buyPriceArrayParam,
            String[] sellPriceArrayParam
    ) {
        super(context, R.layout.list_item, shortNameArrayParam); // Pass the layout and data
        this.context = context;
        imageIDarray = imageIDarrayParam;
        short_nameArray = shortNameArrayParam;
        full_nameArray = fullNameArrayParam;
        buy_priceArray = buyPriceArrayParam;
        sell_priceArray = sellPriceArrayParam;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_item, null, true);

        ImageView kep = rowView.findViewById(R.id.flag);
        TextView full_name = rowView.findViewById(R.id.full_name);
        TextView short_name = rowView.findViewById(R.id.short_name);
        TextView buy_price = rowView.findViewById(R.id.buy_price);
        TextView sell_price = rowView.findViewById(R.id.sell_price);

        kep.setImageResource(imageIDarray[position]);
        full_name.setText(full_nameArray[position]);
        short_name.setText(short_nameArray[position]);
        buy_price.setText(buy_priceArray[position]);
        sell_price.setText(sell_priceArray[position]);

        return rowView;
    }
}
