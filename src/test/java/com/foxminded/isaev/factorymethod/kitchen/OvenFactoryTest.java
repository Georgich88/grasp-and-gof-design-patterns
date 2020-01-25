package com.foxminded.isaev.factorymethod.kitchen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.foxminded.isaev.factorymethod.dishes.Borscht;
import com.foxminded.isaev.factorymethod.dishes.CuisineType;
import com.foxminded.isaev.factorymethod.dishes.Spaghetti;
import com.foxminded.isaev.factorymethod.dishes.Sushi;

class OvenFactoryTest {

    @Test
    void shouldCreateNationalDishes() {

        var ukranianDish = OvenFactory.createDish(CuisineType.UKRANIAN, 1.5D);
        assertEquals(Borscht.class, ukranianDish.getClass());

        var italianDish = OvenFactory.createDish(CuisineType.ITALIAN, 1.5D);
        assertEquals(Spaghetti.class, italianDish.getClass());

        var japaneseDish = OvenFactory.createDish(CuisineType.JAPANESE, 1.5D);
        assertEquals(Sushi.class, japaneseDish.getClass());

    }

}
