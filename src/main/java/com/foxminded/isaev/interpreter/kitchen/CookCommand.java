package com.foxminded.isaev.interpreter.kitchen;

import com.foxminded.isaev.interpreter.pizza.Pizza;

public interface CookCommand {

    Pizza cook(Pizza pizza);

    void setQuantity(int parseInt);
}
