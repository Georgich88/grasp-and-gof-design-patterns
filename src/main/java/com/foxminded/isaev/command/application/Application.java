package com.foxminded.isaev.command.application;

import com.foxminded.isaev.command.kitchen.*;
import com.foxminded.isaev.command.pizza.Pizza;

public class Application {

    public static void main(String[] args) {

        var chief = new ChefInvoker();

        chief.addCookCommand(new CookPizzaBaseCommand(35));
        chief.addCookCommand(new AddCheeseCommand(50));
        chief.addCookCommand(new AddBaconCommand(40));
        Pizza smallCheeseBaconPizza = chief.cookPizza();
        System.out.println(smallCheeseBaconPizza);

        chief.addCookCommand(new CookPizzaBaseCommand(50));
        chief.addCookCommand(new AddPineappleCommand(100));
        Pizza mediumPineapplePizza = chief.cookPizza();
        System.out.println(mediumPineapplePizza);

        chief.addCookCommand(new CookPizzaBaseCommand(60));
        chief.addCookCommand(new AddSeafoodCommand(100));
        Pizza largeSeafoodPizza = chief.cookPizza();
        System.out.println(largeSeafoodPizza);

    }
}
