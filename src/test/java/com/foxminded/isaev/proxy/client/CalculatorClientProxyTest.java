package com.foxminded.isaev.proxy.client;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorClientProxyTest {

    @Test
    void shouldCacheAddParameters() {

        var calculator = new CalculatorClientProxy();

        assertDoesNotThrow(() -> {
            assertEquals(11, calculator.add(5, 6));
        });

        assertTrue(calculator.isAddParameterCached(5,6));

    }

    @Test
    void shouldCacheSubtractParameters() {

        var calculator = new CalculatorClientProxy();

        assertDoesNotThrow(() -> {
            assertEquals(1, calculator.subtract(6, 5));
        });

        assertTrue(calculator.isSubtractParameterCached(6,5));

    }

    @Test
    void shouldCacheMultiplyParameters() {

        var calculator = new CalculatorClientProxy();

        assertDoesNotThrow(() -> {
            assertEquals(30, calculator.multiply(5, 6));
        });

        assertTrue(calculator.isMultiplyParameterCached(5,6));
    }

    @Test
    void shouldCacheDivideParameters() {

        var calculator = new CalculatorClientProxy();

        assertDoesNotThrow(() -> {
            assertEquals(-1, calculator.divide(5, 6));
        });

        assertTrue(calculator.isDivideParameterCached(5,6));

    }
}