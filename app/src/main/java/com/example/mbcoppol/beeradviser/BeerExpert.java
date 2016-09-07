package com.example.mbcoppol.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert{
    static List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jack Pale Ale");
            brands.add("Great Stout");
            brands.add("White Elk");
        }
        return brands;
    }
}
