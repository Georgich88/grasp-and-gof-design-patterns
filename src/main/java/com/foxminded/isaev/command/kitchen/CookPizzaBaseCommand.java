package com.foxminded.isaev.command.kitchen;

import com.foxminded.isaev.command.pizza.Pizza;

public class CookPizzaBaseCommand extends CookPizzaCommand {


    public CookPizzaBaseCommand(int quantity) {
        super(quantity);
    }

    @Override
    public void cook(Pizza pizza) {
        pizza.setPizzaSize(this.getQuantity());

    }
}
