package com.foxminded.isaev.decorator.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PineapplePizzaTest {

    @Test
    void cook() {

        var pizza = new PineapplePizza(new LargePizza());
        assertEquals("pineapple large pizza", pizza.cook());
    }
}