package com.foxminded.isaev.abstractfactory.cafe;

import com.foxminded.isaev.abstractfactory.dishes.CuisineType;

public class CafeFactoryProducer {

    public static NationalCuisineAbstractFactory generateNationalCuisineFactory(CuisineType cuisineType) {
        if (cuisineType == CuisineType.AMERIACAN) {
            return  new AmericanCuisineFactory();
        } else if (cuisineType == CuisineType.JAPANESE) {
            return  new JapaneseCuisineFactory();
        } else if (cuisineType == CuisineType.UKRANIAN) {
            return  new UkrainianCuisineFactory();
        } else {
            throw new IllegalArgumentException("Cannot recognize cuisine type");
        }
    }
}
