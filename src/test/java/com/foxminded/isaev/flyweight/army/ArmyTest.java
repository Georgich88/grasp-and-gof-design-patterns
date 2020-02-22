package com.foxminded.isaev.flyweight.army;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArmyTest {

    @Test
    void shouldAddSoldiers() {
        var army = new Army();
        var texture = new byte[100];
        var sound = new byte[100];
        army.addSoldiers(100, texture, sound, "lieutenant");
        assertEquals(100, army.getUnits().size());
        army.getUnits().forEach(unit -> assertTrue(unit instanceof Soldier));
    }

    @Test
    void shouldAddTanks() {
        var army = new Army();
        var texture = new byte[100];
        var sound = new byte[100];
        army.addTanks(2, texture, sound, "T-100");
        assertEquals(2, army.getUnits().size());
        army.getUnits().forEach(unit -> assertTrue(unit instanceof Tank));
    }

    @Test
    void shouldMove() {
        var army = new Army();
        army.move(100,100);
        assertTrue(army.getxCoordinate() == 100 && army.getyCoordinate() == 100);
    }

    @Test
    void shouldAttack() {

        var army = new Army();
        var texture = new byte[100];
        var sound = new byte[100];

        army.addSoldiers(100, texture, sound, "lieutenant")
            .addTanks(2, texture, sound, "T-100");

        army.attack();

    }
}