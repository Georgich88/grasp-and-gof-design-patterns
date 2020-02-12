package com.foxminded.isaev.decorator.pizza;

public class MushroomPizza extends PizzaDecorator {

    public MushroomPizza(CookablePizza pizza) {
        super(pizza);
    }

    @Override
    public String cook() {
        return cookMushroomPizza() + super.cook();
    }

    private String cookMushroomPizza() {
        return "mushroom ";
    }
}
