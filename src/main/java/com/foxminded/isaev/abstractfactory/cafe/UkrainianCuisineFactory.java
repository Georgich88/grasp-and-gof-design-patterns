package com.foxminded.isaev.abstractfactory.cafe;

import com.foxminded.isaev.abstractfactory.dishes.Meal;
import com.foxminded.isaev.abstractfactory.dishes.UkrainianComboMeal;

public class UkrainianCuisineFactory extends NationalCuisineAbstractFactory {
    public Meal cookComboMeal() {
        return new UkrainianComboMeal();
    }
}
