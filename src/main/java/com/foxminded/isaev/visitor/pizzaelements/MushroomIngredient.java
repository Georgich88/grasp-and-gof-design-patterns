package com.foxminded.isaev.visitor.pizzaelements;

import com.foxminded.isaev.visitor.pizza.PizzaVisitor;

public class MushroomIngredient extends PizzaIngredient {

    public MushroomIngredient(int quantity) {
        super(quantity);
    }

    @Override
    public void accept(PizzaVisitor visitor) {
        visitor.visit(this);
    }
}
