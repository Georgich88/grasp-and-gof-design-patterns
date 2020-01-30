package com.foxminded.isaev.builder.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTest {

    @Test
    public void shouldCreatePizzas(){

        Pizza smallCheeseBaconPizza = new Pizza.PizzaBuilder()
                .setPizzaSize(35)
                .setCheeseQuantity(50)
                .setBaconQuantity(40)
                .createPizza();
        assertEquals(35, smallCheeseBaconPizza.getPizzaSize());
        assertEquals(50D, smallCheeseBaconPizza.getCheeseQuantity());
        assertEquals(40D, smallCheeseBaconPizza.getBaconQuantity());
        assertEquals(0, smallCheeseBaconPizza.getPineappleQuantity());
        assertEquals(0, smallCheeseBaconPizza.getMushroomQuantity());
        assertEquals(0, smallCheeseBaconPizza.getSeafoodQuantity());

        Pizza mediumPineapplePizza = new Pizza.PizzaBuilder()
                .setPizzaSize(50)
                .setPineappleQuantity(100)
                .createPizza();
        assertEquals(50, mediumPineapplePizza.getPizzaSize());
        assertEquals(0, mediumPineapplePizza.getCheeseQuantity());
        assertEquals(0, mediumPineapplePizza.getBaconQuantity());
        assertEquals(100D, mediumPineapplePizza.getPineappleQuantity());
        assertEquals(0, mediumPineapplePizza.getMushroomQuantity());
        assertEquals(0, mediumPineapplePizza.getSeafoodQuantity());

        Pizza largeSeafoodPizza = new Pizza.PizzaBuilder()
                .setPizzaSize(60)
                .setCheeseQuantity(50)
                .setSeafoodQuantity(100)
                .createPizza();
        assertEquals(60, largeSeafoodPizza.getPizzaSize());
        assertEquals(50D, largeSeafoodPizza.getCheeseQuantity());
        assertEquals(0, largeSeafoodPizza.getBaconQuantity());
        assertEquals(0, largeSeafoodPizza.getPineappleQuantity());
        assertEquals(0, largeSeafoodPizza.getMushroomQuantity());
        assertEquals(100D, largeSeafoodPizza.getSeafoodQuantity());


    }
}
