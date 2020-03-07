package com.foxminded.isaev.visitor.pizzaelements;

import com.foxminded.isaev.visitor.pizza.PizzaVisitor;

public class CheeseIngredient extends PizzaIngredient {

    public CheeseIngredient(int quantity) {
        super(quantity);
    }

    @Override
    public void accept(PizzaVisitor visitor) {
        visitor.visit(this);
    }
}
