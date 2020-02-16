package com.foxminded.isaev.decorator.pizza;

public class LargePizza implements CookablePizza {
    @Override
    public String cook() {
        return "large pizza";
    }
}
