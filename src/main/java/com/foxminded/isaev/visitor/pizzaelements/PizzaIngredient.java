package com.foxminded.isaev.visitor.pizzaelements;

abstract class PizzaIngredient implements Ingredient {

    private int quantity;

    public PizzaIngredient(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
