package com.foxminded.isaev.decorator.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeafoodPizzaTest {

    @Test
    void cook() {
        var pizza = new SeafoodPizza(new LargePizza());
        assertEquals("seafood large pizza", pizza.cook());
    }
}