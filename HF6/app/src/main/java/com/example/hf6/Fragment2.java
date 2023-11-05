package com.example.hf6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment2 extends Fragment {
    private static final String ARG_SELECTED_SHORT_NAME = "selected_short_name";
    private static final String ARG_SELECTED_FLAG_RESOURCE = "selected_flag_resource";
    private static final String ARG_SELECTED_BUY_PRICE = "selected_buy_price";
    private static final String ARG_SELECTED_SELL_PRICE = "selected_sell_price";
    private static final String ARG_SELECTED_FULL_NAME = "selected_full_name";

    private String selectedShortName;
    private int selectedFlagResource;
    private String selectedBuyPrice;
    private String selectedSellPrice;
    private String selectedFullName;

    public Fragment2() {
        // asd
    }

    public static Fragment2 newInstance(String selectedShortName, int selectedFlagResource, String selectedBuyPrice, String selectedSellPrice, String selectedFullName) {
        Fragment2 fragment = new Fragment2();
        Bundle args = new Bundle();
        args.putString(ARG_SELECTED_SHORT_NAME, selectedShortName);
        args.putInt(ARG_SELECTED_FLAG_RESOURCE, selectedFlagResource);
        args.putString(ARG_SELECTED_BUY_PRICE, selectedBuyPrice);
        args.putString(ARG_SELECTED_SELL_PRICE, selectedSellPrice);
        args.putString(ARG_SELECTED_FULL_NAME, selectedFullName);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            selectedShortName = getArguments().getString(ARG_SELECTED_SHORT_NAME);
            selectedFlagResource = getArguments().getInt(ARG_SELECTED_FLAG_RESOURCE);
            selectedBuyPrice = getArguments().getString(ARG_SELECTED_BUY_PRICE);
            selectedSellPrice = getArguments().getString(ARG_SELECTED_SELL_PRICE);
            selectedFullName = getArguments().getString(ARG_SELECTED_FULL_NAME);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_2, container, false);

        // Find and set the values for the views in fragment_2 layout
        TextView shortNameTextView = rootView.findViewById(R.id.short_name);
        ImageView flagImageView = rootView.findViewById(R.id.flag);
        TextView buyPriceTextView = rootView.findViewById(R.id.buy_price);
        TextView sellPriceTextView = rootView.findViewById(R.id.sell_price);
        TextView fullNameTextView = rootView.findViewById(R.id.full_name);

        shortNameTextView.setText(selectedShortName);
        flagImageView.setImageResource(selectedFlagResource);
        buyPriceTextView.setText("Cumpara: " + selectedBuyPrice);
        sellPriceTextView.setText("Vinde: " + selectedSellPrice);
        fullNameTextView.setText(selectedFullName);

        return rootView;
    }
}


