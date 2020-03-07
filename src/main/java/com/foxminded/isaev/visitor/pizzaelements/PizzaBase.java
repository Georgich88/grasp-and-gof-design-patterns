package com.foxminded.isaev.visitor.pizzaelements;

import com.foxminded.isaev.visitor.pizza.PizzaVisitor;
import com.foxminded.isaev.visitor.pizzaelements.Ingredient;
import com.foxminded.isaev.visitor.pizzaelements.PizzaIngredient;

import java.util.ArrayList;
import java.util.List;

public class PizzaBase extends PizzaIngredient {

    List<Ingredient> ingredients = new ArrayList<>();

    public PizzaBase(int quantity) {
        super(quantity);
    }

    public Ingredient addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
        return ingredient;
    }

    @Override
    public void accept(PizzaVisitor pizzaVisitor) {
        pizzaVisitor.visit(this);
        for (var ingredient : this.ingredients) {
            ingredient.accept(pizzaVisitor);
        }
    }
}
