package com.foxminded.isaev.proxy.client;

public class CalculatorClientImpl implements CalculatorClient {
    @Override
    public int add(int a, int b) throws CalculationOperationException {
        return CalculatorFacade.add(a, b);
    }

    @Override
    public int subtract(int a, int b) throws CalculationOperationException {
        return CalculatorFacade.subtract(a, b);
    }

    @Override
    public int multiply(int a, int b) throws CalculationOperationException {
        return CalculatorFacade.multiply(a, b);
    }

    @Override
    public int divide(int a, int b) throws CalculationOperationException {
        return CalculatorFacade.divide(a, b);
    }
}
