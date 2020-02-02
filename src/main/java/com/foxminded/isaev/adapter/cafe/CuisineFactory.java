package com.foxminded.isaev.adapter.cafe;

import com.foxminded.isaev.adapter.cuisine.ChineseCuisineAdapter;
import com.foxminded.isaev.adapter.cuisine.CuisineAdapter;
import com.foxminded.isaev.adapter.cuisine.CuisineType;
import com.foxminded.isaev.adapter.cuisine.VietnameseCuisineAdapter;

public class CuisineFactory {

    public static CuisineAdapter createCuisine(CuisineType cuisineType) {

        CuisineAdapter cuisine;

        switch (cuisineType) {
            case VIETNAMESE:
                cuisine = new VietnameseCuisineAdapter();
                break;
            case CHINESE:
                cuisine = new ChineseCuisineAdapter();
                break;
            default:
                throw new IllegalArgumentException("Unknown cuisine type");
        }

        return cuisine;

    }
}
