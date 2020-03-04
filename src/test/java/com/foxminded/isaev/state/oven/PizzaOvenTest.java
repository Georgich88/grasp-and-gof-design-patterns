package com.foxminded.isaev.state.oven;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOvenTest {

    @Test
    void shouldBake() {

        assertDoesNotThrow(()->{
            var oven = new PizzaOven();
            oven.nextState();
            oven.bake();
        });
        
    }
}