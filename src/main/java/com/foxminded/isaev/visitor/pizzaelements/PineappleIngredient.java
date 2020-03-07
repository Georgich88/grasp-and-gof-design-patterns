package com.foxminded.isaev.visitor.pizzaelements;

import com.foxminded.isaev.visitor.pizza.PizzaVisitor;

public class PineappleIngredient extends PizzaIngredient {

    public PineappleIngredient(int quantity) {
        super(quantity);
    }

    @Override
    public void accept(PizzaVisitor visitor) {
        visitor.visit(this);
    }
}
