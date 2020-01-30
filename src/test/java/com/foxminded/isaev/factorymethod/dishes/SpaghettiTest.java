package com.foxminded.isaev.factorymethod.dishes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class SpaghettiTest {

    @Test
    void shouldCreateSpaghetti() {

        var italianSpaghetti = new Spaghetti();

        assertEquals(20, italianSpaghetti.calculateEstimatedCookingTime(1D));
        assertEquals(LocalDateTime.of(2020, 1, 1, 00, 20),
                italianSpaghetti.calculateReadyTime(LocalDateTime.of(2020, 1, 1, 00, 00)));
    }

}
