package com.foxminded.isaev.visitor.pizzaelements;

import com.foxminded.isaev.visitor.pizza.PizzaVisitor;

public interface Ingredient {

    void accept(PizzaVisitor visitor);

    void setQuantity(int quantity);
}
