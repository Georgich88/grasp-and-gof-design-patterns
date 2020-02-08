package com.foxminded.isaev.adapter.application;

import com.foxminded.isaev.adapter.cafe.CuisineFactory;
import com.foxminded.isaev.adapter.cuisine.CuisineType;


public class Application {

    public static void main(String[] args) {

        var chineseCuisine = CuisineFactory.createCuisine(CuisineType.CHINESE);
        chineseCuisine.cook();
        chineseCuisine.order();

        var vietnameseCuisine = CuisineFactory.createCuisine(CuisineType.VIETNAMESE);
        vietnameseCuisine.cook();
        vietnameseCuisine.order();

    }
    

}
