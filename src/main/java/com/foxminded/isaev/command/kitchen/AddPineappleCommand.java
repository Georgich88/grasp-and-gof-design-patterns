package com.foxminded.isaev.command.kitchen;

import com.foxminded.isaev.command.pizza.Pizza;

public class AddPineappleCommand extends CookPizzaCommand {

    public AddPineappleCommand(int quantity) {
        super(quantity);
    }

    @Override
    public void cook(Pizza pizza) {
        pizza.setPineappleQuantity(this.getQuantity());
    }
}
