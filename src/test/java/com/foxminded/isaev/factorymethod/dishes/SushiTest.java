package com.foxminded.isaev.factorymethod.dishes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class SushiTest {

    @Test
    void shouldCreateSushi() {

        var japaneseSushi = new Sushi();

        assertEquals(85, japaneseSushi.calculateEstimatedCookingTime(1.9D));
        assertEquals(LocalDateTime.of(2020, 1, 1, 01, 25),
                japaneseSushi.calculateReadyTime(LocalDateTime.of(2020, 1, 1, 00, 00)));
    }

}
