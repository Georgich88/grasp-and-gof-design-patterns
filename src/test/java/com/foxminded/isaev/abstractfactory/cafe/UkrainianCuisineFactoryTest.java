package com.foxminded.isaev.abstractfactory.cafe;

import com.foxminded.isaev.abstractfactory.dishes.UkrainianComboMeal;
import com.foxminded.isaev.abstractfactory.dishes.Meal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UkrainianCuisineFactoryTest {

    @Test
    public void shouldCreateUkrainianComboMeal(){

        NationalCuisineAbstractFactory ukrainianMenu = new UkrainianCuisineFactory();
        Meal ukrainianMeal = ukrainianMenu.cookComboMeal();

        assertTrue(ukrainianMeal instanceof UkrainianComboMeal);

    }
}
