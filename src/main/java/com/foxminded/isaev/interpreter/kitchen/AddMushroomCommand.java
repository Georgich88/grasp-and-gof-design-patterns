package com.foxminded.isaev.interpreter.kitchen;

import com.foxminded.isaev.interpreter.pizza.Pizza;

public class AddMushroomCommand extends CookPizzaCommand {

    @Override
    public Pizza cook(Pizza pizza) {
        pizza.setMushroomQuantity(this.getQuantity());
        return pizza;
    }


}
