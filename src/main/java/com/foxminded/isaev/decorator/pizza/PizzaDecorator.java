package com.foxminded.isaev.decorator.pizza;

public abstract class PizzaDecorator implements CookablePizza {

    private CookablePizza pizza;

    public PizzaDecorator(CookablePizza pizza) {
        this.pizza = pizza;
    }

    public String cook() {
        return pizza.cook();
    }

}
