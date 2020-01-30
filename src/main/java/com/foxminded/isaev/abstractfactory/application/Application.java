package com.foxminded.isaev.abstractfactory.application;

import com.foxminded.isaev.abstractfactory.cafe.CafeFactoryProducer;
import com.foxminded.isaev.abstractfactory.dishes.CuisineType;

public class Application {

    public static void main(String[] args){

        var ukrainianMenu = CafeFactoryProducer.generateNationalCuisineFactory(CuisineType.UKRANIAN);
        var ukrainianMeal = ukrainianMenu.cookComboMeal();
        ukrainianMeal.printCookingStatus();

        var americanMenu = CafeFactoryProducer.generateNationalCuisineFactory(CuisineType.AMERIACAN);
        var americanMeal = americanMenu.cookComboMeal();
        americanMeal.printCookingStatus();

        var japaneseMenu = CafeFactoryProducer.generateNationalCuisineFactory(CuisineType.JAPANESE);
        var japaneseMeal = japaneseMenu.cookComboMeal();
        japaneseMeal.printCookingStatus();

    }
}
