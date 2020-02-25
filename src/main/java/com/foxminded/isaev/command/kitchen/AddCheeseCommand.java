package com.foxminded.isaev.command.kitchen;

import com.foxminded.isaev.command.pizza.Pizza;

public class AddCheeseCommand extends CookPizzaCommand {

    public AddCheeseCommand(int quantity) {
        super(quantity);
    }

    @Override
    public void cook(Pizza pizza) {
        pizza.setCheeseQuantity(this.getQuantity());
    }
}
