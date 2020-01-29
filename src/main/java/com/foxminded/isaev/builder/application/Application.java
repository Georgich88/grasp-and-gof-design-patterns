package com.foxminded.isaev.builder.application;

import com.foxminded.isaev.builder.pizza.Pizza;

public class Application {

    public static void main(String[] args){

        Pizza smallCheeseBaconPizza = new Pizza.PizzaBuilder()
                .setPizzaSize(35)
                .setCheeseQuantity(50)
                .setBaconQuantity(40)
                .createPizza();
        System.out.println(smallCheeseBaconPizza);

        Pizza mediumPineapplePizza = new Pizza.PizzaBuilder()
                .setPizzaSize(50)
                .setPineappleQuantity(100)
                .createPizza();
        System.out.println(mediumPineapplePizza);

        Pizza largeSeafoodPizza = new Pizza.PizzaBuilder()
                .setPizzaSize(60)
                .setPineappleQuantity(100)
                .createPizza();
        System.out.println(largeSeafoodPizza);

    }

}
