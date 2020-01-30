package com.foxminded.isaev.factorymethod.application;

import java.time.LocalDateTime;

import com.foxminded.isaev.factorymethod.dishes.CuisineType;
import com.foxminded.isaev.factorymethod.kitchen.OvenFactory;

public class Application {

    public static void main(String[] args) {

        var ukranianDish = OvenFactory.createDish(CuisineType.UKRANIAN, 1.0D);
        ukranianDish.printReadyTime(LocalDateTime.now());

        var italianDish = OvenFactory.createDish(CuisineType.ITALIAN, 1.0D);
        italianDish.printReadyTime(LocalDateTime.now());

        var japaneseDish = OvenFactory.createDish(CuisineType.JAPANESE, 1.0D);
        japaneseDish.printReadyTime(LocalDateTime.now());

    }
    

}
