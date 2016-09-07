package com.example.ntwhitfi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class Find_Beer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find__beer);

    }

    //Call when button is clicked
    public void onClickFindBeer(View view) {

        //Create beerExpert class instance
        BeerExpert expert = new BeerExpert();

        //Get reference to the Text View
        TextView brands = (TextView) findViewById(R.id.brands);

        //Get reference to the spinner
        Spinner color = (Spinner) findViewById(R.id.color);

        //Get selected line item from spinner
        String beerType = String.valueOf(color.getSelectedItem());

        //Get recommendations from BeerExpert Class
        List<String> brandList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandList) {
            brandsFormatted.append(brand).append('\n');
        }

        //Display beers
        //brands.setText(beerType);
        brands.setText(brandsFormatted);
    }
}

