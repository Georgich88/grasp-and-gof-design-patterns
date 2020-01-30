package com.foxminded.isaev.factorymethod.dishes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class BorschtTest {

    @Test
    void shouldCreateBorscht() {

        var ukranianBorscht = new Borscht();

        assertEquals(120, ukranianBorscht.calculateEstimatedCookingTime(1D));
        assertEquals(LocalDateTime.of(2020, 1, 1, 02, 00),
                ukranianBorscht.calculateReadyTime(LocalDateTime.of(2020, 1, 1, 00, 00)));
    }

}
