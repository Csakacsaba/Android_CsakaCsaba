package com.example.hf6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment1 extends Fragment {
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

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment1.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment1 newInstance(String param1, String param2) {
        Fragment1 fragment = new Fragment1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_1, container, false);
        myList = rootView.findViewById(R.id.list_view); // Find the ListView in the inflated view

        CustomListViewAdapter egyszeruAdapter = new CustomListViewAdapter(
                getActivity(), imageArray, short_nameArray, full_nameArray, buy_priceArray, sell_priceArray
        );
        myList.setAdapter(egyszeruAdapter);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedShortName = short_nameArray[position];
                int selectedFlagResource = imageArray[position];
                String selectedBuyPrice = buy_priceArray[position];
                String selectedSellPrice = sell_priceArray[position];
                String selectedFullName = full_nameArray[position];

                navigateToFragment2(selectedShortName, selectedFlagResource, selectedBuyPrice, selectedSellPrice, selectedFullName);
            }
        });
        return rootView;
    }
    private void navigateToFragment2(String selectedShortName, int selectedFlagResource, String selectedBuyPrice, String selectedSellPrice, String selectedFullName) {
        Fragment2 fragment2 = Fragment2.newInstance(selectedShortName, selectedFlagResource, selectedBuyPrice, selectedSellPrice, selectedFullName);

        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragment2)
                .addToBackStack(null)
                .commit();
    }



}