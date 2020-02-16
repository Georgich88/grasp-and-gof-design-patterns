package com.foxminded.isaev.decorator.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MushroomPizzaTest {

    @Test
    void cook() {
        var pizza = new MushroomPizza(new LargePizza());
        assertEquals("mushroom large pizza", pizza.cook());
    }
}