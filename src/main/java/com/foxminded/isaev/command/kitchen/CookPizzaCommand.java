package com.foxminded.isaev.command.kitchen;

import com.foxminded.isaev.command.pizza.Pizza;

abstract class CookPizzaCommand implements CookCommand {

    private int quantity;

    public CookPizzaCommand(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
