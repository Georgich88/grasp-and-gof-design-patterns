package com.foxminded.isaev.factorymethod.kitchen;

import com.foxminded.isaev.factorymethod.dishes.Borscht;
import com.foxminded.isaev.factorymethod.dishes.CuisineType;
import com.foxminded.isaev.factorymethod.dishes.Dish;
import com.foxminded.isaev.factorymethod.dishes.Spaghetti;
import com.foxminded.isaev.factorymethod.dishes.Sushi;

public class OvenFactory {

    public static Dish createDish(CuisineType cuisineType, double busyRate) {

        Dish dish;

        switch (cuisineType) {
        case ITALIAN:
            dish = new Spaghetti();
            break;
        case JAPANESE:
            dish = new Sushi();
            break;
        case UKRANIAN:
            dish = new Borscht();
            break;
        default:
            throw new IllegalArgumentException("Unknown cuisine type");
        }

        dish.calculateEstimatedCookingTime(busyRate);
        return dish;

    }

}
