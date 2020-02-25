package com.foxminded.isaev.command.kitchen;

import com.foxminded.isaev.command.pizza.Pizza;

import java.util.LinkedList;

public class ChefInvoker {

    private LinkedList<CookPizzaCommand> commands = new LinkedList<CookPizzaCommand>();

    public ChefInvoker addCookCommand(CookPizzaCommand cookCommand) {
        this.commands.add(cookCommand);
        return this;
    }

    public Pizza cookPizza() {

        var pizza = new Pizza();

        while (!commands.isEmpty()){
            var command = commands.removeFirst();
            command.cook(pizza);
        }

        return pizza;

    }


}
