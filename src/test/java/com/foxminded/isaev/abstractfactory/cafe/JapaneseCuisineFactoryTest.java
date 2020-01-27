package com.foxminded.isaev.abstractfactory.cafe;

import com.foxminded.isaev.abstractfactory.dishes.AmericanComboMeal;
import com.foxminded.isaev.abstractfactory.dishes.JapaneseComboMeal;
import com.foxminded.isaev.abstractfactory.dishes.Meal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JapaneseCuisineFactoryTest {

    @Test
    public void shouldCreateJapaneseComboMeal(){

        NationalCuisineAbstractFactory japaneseMenu = new JapaneseCuisineFactory();
        Meal japaneseMeal = japaneseMenu.cookComboMeal();

        assertTrue(japaneseMeal instanceof JapaneseComboMeal);

    }
}
