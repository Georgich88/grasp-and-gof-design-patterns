package com.foxminded.isaev.flyweight.application;

import com.foxminded.isaev.flyweight.army.Army;

public class Application {

    public static void main(String[] args) {

        var ourArmy = new Army();
        var enemyArmy = new Army();
        var texture = new byte[100];
        var sound = new byte[100];

        ourArmy
                .addSoldiers(100, texture, sound, "lieutenant")
                .addTanks(2, texture, sound, "T-100");

        enemyArmy
                .addSoldiers(100, texture, sound, "lieutenant")
                .addTanks(2, texture, sound, "T-100");

        ourArmy.move(1000, 1000);
        enemyArmy.move(356,439);

        ourArmy.attack();
        enemyArmy.attack();

    }

}
