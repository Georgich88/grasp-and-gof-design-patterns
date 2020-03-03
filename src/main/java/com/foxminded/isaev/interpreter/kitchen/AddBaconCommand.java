package com.foxminded.isaev.interpreter.kitchen;

import com.foxminded.isaev.interpreter.pizza.Pizza;

public class AddBaconCommand extends CookPizzaCommand {

    @Override
    public Pizza cook(Pizza pizza) {
        pizza.setBaconQuantity(this.getQuantity());
        return pizza;
    }
}
