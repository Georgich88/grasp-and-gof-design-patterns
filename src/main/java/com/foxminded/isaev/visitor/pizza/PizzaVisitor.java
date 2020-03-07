package com.foxminded.isaev.visitor.pizza;

import com.foxminded.isaev.visitor.pizzaelements.*;

public interface PizzaVisitor {

    void visit(BaconIngredient ingredient);

    void visit(CheeseIngredient ingredient);

    void visit(MushroomIngredient ingredient);

    void visit(PineappleIngredient ingredient);

    void visit(SeafoodIngredient ingredient);

    void visit(PizzaBase ingredient);

}
