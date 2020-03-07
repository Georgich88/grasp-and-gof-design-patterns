package com.foxminded.isaev.visitor.pizzaelements;

import com.foxminded.isaev.visitor.pizza.PizzaVisitor;

public class BaconIngredient extends PizzaIngredient {

    public BaconIngredient(int quantity) {
        super(quantity);
    }

    @Override
    public void accept(PizzaVisitor visitor) {
        visitor.visit(this);
    }

}


