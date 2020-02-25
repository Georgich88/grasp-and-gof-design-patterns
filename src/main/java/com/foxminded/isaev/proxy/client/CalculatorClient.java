package com.foxminded.isaev.proxy.client;

public interface CalculatorClient {

    int add(int a, int b) throws CalculationOperationException;

    int subtract(int a, int b) throws CalculationOperationException;

    int multiply(int a, int b) throws CalculationOperationException;

    int divide(int a, int b) throws CalculationOperationException;
}
