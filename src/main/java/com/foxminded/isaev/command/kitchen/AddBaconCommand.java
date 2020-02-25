package com.foxminded.isaev.command.kitchen;

import com.foxminded.isaev.command.pizza.Pizza;

public class AddBaconCommand extends CookPizzaCommand {

    public AddBaconCommand(int quantity) {
        super(quantity);
    }

    @Override
    public void cook(Pizza pizza) {
        pizza.setBaconQuantity(this.getQuantity());
    }
}
