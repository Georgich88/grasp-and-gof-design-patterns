package com.foxminded.isaev.state.application;

import com.foxminded.isaev.state.oven.PizzaOven;

public class Application {

    public static void main(String[] args) {

        var oven = new PizzaOven();
        oven.bake();
        oven.nextState();
        oven.bake();
        oven.nextState();
        oven.bake();
        oven.previousState();
        oven.bake();

    }
}
