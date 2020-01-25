package com.foxminded.isaev.factorymethod.kitchen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.foxminded.isaev.factorymethod.dishes.Borscht;
import com.foxminded.isaev.factorymethod.dishes.CuisineType;
import com.foxminded.isaev.factorymethod.dishes.Spaghetti;
import com.foxminded.isaev.factorymethod.dishes.Sushi;

class OvenTest {

    @Test
    void shouldCreateNationalDishes() {

        var ukranianDish = Oven.createDish(CuisineType.UKRANIAN, 1.5D);
        assertEquals(Borscht.class, ukranianDish.getClass());

        var italianDish = Oven.createDish(CuisineType.ITALIAN, 1.5D);
        assertEquals(Spaghetti.class, italianDish.getClass());

        var japaneseDish = Oven.createDish(CuisineType.JAPANESE, 1.5D);
        assertEquals(Sushi.class, japaneseDish.getClass());

    }

}
