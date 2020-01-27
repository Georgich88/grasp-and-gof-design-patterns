package com.foxminded.isaev.abstractfactory.cafe;

import com.foxminded.isaev.abstractfactory.dishes.AmericanComboMeal;
import com.foxminded.isaev.abstractfactory.dishes.Meal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AmericanCuisineFactoryTest {

    @Test
    public void shouldCreateAmericanComboMeal(){

        NationalCuisineAbstractFactory americanMenu = new AmericanCuisineFactory();
        Meal americanMeal = americanMenu.cookComboMeal();

        assertTrue(americanMeal instanceof AmericanComboMeal);

    }
}
