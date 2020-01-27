package com.foxminded.isaev.abstractfactory.cafe;

import com.foxminded.isaev.abstractfactory.dishes.JapaneseComboMeal;
import com.foxminded.isaev.abstractfactory.dishes.Meal;
import com.foxminded.isaev.abstractfactory.dishes.AmericanComboMeal;

public class JapaneseCuisineFactory extends NationalCuisineAbstractFactory {
    public Meal cookComboMeal() {
        return new JapaneseComboMeal();
    }
}
