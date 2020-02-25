package com.foxminded.isaev.command.kitchen;

import com.foxminded.isaev.command.pizza.Pizza;

public class AddSeafoodCommand extends CookPizzaCommand {

    public AddSeafoodCommand(int quantity) {
        super(quantity);
    }

    @Override
    public void cook(Pizza pizza) {
        pizza.setSeafoodQuantity(this.getQuantity());
    }
}
