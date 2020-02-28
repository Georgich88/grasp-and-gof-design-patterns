package com.foxminded.isaev.interpreter.application;

<<<<<<< HEAD
import com.foxminded.isaev.interpreter.kitchen.ChefInvoker;
import com.foxminded.isaev.interpreter.kitchen.InterpreterCookingPizzaException;
=======
import com.foxminded.isaev.interpreter.kitchen.*;
import com.foxminded.isaev.interpreter.pizza.Pizza;
>>>>>>> 61f2db07d221c96a03294357a4bf13c658ad4141

public class Application {

    public static void main(String[] args) throws InterpreterCookingPizzaException {

        var chief = new ChefInvoker();
        var smallCheeseBaconPizza = chief.cookPizza("Cook pizza 35 with cheese 50 and bacon 40");
        System.out.println(smallCheeseBaconPizza);

        var mediumPineapplePizza = chief.cookPizza("Make the most delicious pizza you can size 50 sm. " +
                "I also need additional pineapple 100");
        System.out.println(mediumPineapplePizza);

        var largeSeafoodPizza = chief.cookPizza("Please, cook  me a pizza 60 size and I need seafood 100 gram");
        System.out.println(largeSeafoodPizza);

    }
}
