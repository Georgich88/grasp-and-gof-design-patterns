package com.foxminded.isaev.interpreter.kitchen;

import com.foxminded.isaev.interpreter.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class CookPizzaBaseCommand extends CookPizzaCommand {

    List<CookCommand> commands = new ArrayList<>();

    public CookCommand addCommand(CookCommand command) {
        this.commands.add(command);
        return command;
    }

    @Override
    public Pizza cook(Pizza pizza) {

        pizza.setPizzaSize(this.getQuantity());
        for (var command : commands) {
            command.cook(pizza);
        }
        return pizza;
    }
}
