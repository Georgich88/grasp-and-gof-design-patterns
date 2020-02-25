package com.foxminded.isaev.command.kitchen;

import com.foxminded.isaev.command.pizza.Pizza;

public class AddMushroomCommand extends CookPizzaCommand {

    public AddMushroomCommand(int quantity) {
        super(quantity);
    }

    @Override
    public void cook(Pizza pizza) {
        pizza.setMushroomQuantity(this.getQuantity());
    }


}
