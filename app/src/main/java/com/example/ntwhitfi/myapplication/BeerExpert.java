package com.example.ntwhitfi.myapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ntwhitfi on 9/7/2016.
 */
public class BeerExpert {
    List<String> getBrands (String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add("jack Amber");
            brands.add("jack Moose");
        }
        else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }

        return brands;
    }
}
