package com.foxminded.isaev.decorator.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaconPizzaTest {

    @Test
    void cook() {
        var pizza = new BaconPizza(new LargePizza());
        assertEquals("bacon large pizza", pizza.cook());
    }
}