package com.foxminded.isaev.state.oven;

public interface PizzaOvenState {

    void next(PizzaOven oven);

    void prev(PizzaOven oven);

    void bake() throws OvenBakeryException;

}
