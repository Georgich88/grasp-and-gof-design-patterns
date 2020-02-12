package com.foxminded.isaev.decorator.application;

import com.foxminded.isaev.decorator.pizza.*;

public class Application {

    public static void main(String[] args) {

        var pineappleCheeseLargePizza = new PineapplePizza(new CheesePizza(new LargePizza()));
        System.out.println(pineappleCheeseLargePizza.cook());

        var seafoodLargePizza = new SeafoodPizza(new LargePizza());
        System.out.println(seafoodLargePizza.cook());

        var mushroomBaconPizza = new MushroomPizza(new BaconPizza(new LargePizza()));
        System.out.println(mushroomBaconPizza.cook());

    }
}
