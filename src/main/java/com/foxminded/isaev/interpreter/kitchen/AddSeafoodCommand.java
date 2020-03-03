package com.foxminded.isaev.interpreter.kitchen;

import com.foxminded.isaev.interpreter.pizza.Pizza;

public class AddSeafoodCommand extends CookPizzaCommand {

    @Override
    public Pizza cook(Pizza pizza) {
        pizza.setSeafoodQuantity(this.getQuantity());
        return pizza;
    }
}
