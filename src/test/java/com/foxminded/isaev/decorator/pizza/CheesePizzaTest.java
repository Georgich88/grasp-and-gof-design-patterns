package com.foxminded.isaev.decorator.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheesePizzaTest {

    @Test
    void cook() {
        var pizza = new CheesePizza(new LargePizza());
        assertEquals("cheese large pizza", pizza.cook());
    }
}