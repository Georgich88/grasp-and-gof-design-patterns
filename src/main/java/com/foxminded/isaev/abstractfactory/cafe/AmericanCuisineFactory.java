package com.foxminded.isaev.abstractfactory.cafe;

import com.foxminded.isaev.abstractfactory.dishes.AmericanComboMeal;
import com.foxminded.isaev.abstractfactory.dishes.Meal;

public class AmericanCuisineFactory extends NationalCuisineAbstractFactory {
    public Meal cookComboMeal() {
        return new AmericanComboMeal();
    }
}
