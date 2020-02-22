package com.foxminded.isaev.proxy.client;


import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

class OperationParameters {

    public static Map.Entry<Integer, Integer> of(Integer first, Integer second) {
        return new AbstractMap.SimpleEntry<>(first, second);
    }
}

public class CalculatorClientProxy implements CalculatorClient {

    private CalculatorClientImpl calculator = new CalculatorClientImpl();

    private HashMap<Map.Entry<Integer, Integer>, Integer> addOperationCache = new HashMap<>();
    private HashMap<Map.Entry<Integer, Integer>, Integer> subtractOperationCache = new HashMap<>();
    private HashMap<Map.Entry<Integer, Integer>, Integer> multiplyOperationCache = new HashMap<>();
    private HashMap<Map.Entry<Integer, Integer>, Integer> divideOperationCache = new HashMap<>();

    @Override
    public int add(int a, int b) throws CalculationOperationException {
        var parameters = OperationParameters.of(a, b);
        if (!addOperationCache.containsKey(parameters)) {
            addOperationCache.put(parameters, calculator.add(a, b));
        }
        return addOperationCache.get(parameters);
    }

    @Override
    public int subtract(int a, int b) throws CalculationOperationException {
        var parameters = OperationParameters.of(a, b);
        if (!subtractOperationCache.containsKey(parameters)) {
            subtractOperationCache.put(parameters, calculator.subtract(a, b));
        }
        return subtractOperationCache.get(parameters);
    }

    @Override
    public int multiply(int a, int b) throws CalculationOperationException {
        var parameters = OperationParameters.of(a, b);
        if (!multiplyOperationCache.containsKey(parameters)) {
            multiplyOperationCache.put(parameters, calculator.multiply(a, b));
        }
        return multiplyOperationCache.get(parameters);
    }

    @Override
    public int divide(int a, int b) throws CalculationOperationException {
        var parameters = OperationParameters.of(a, b);
        if (!divideOperationCache.containsKey(parameters)) {
            divideOperationCache.put(parameters, calculator.divide(a, b));
        }
        return divideOperationCache.get(parameters);
    }

    public boolean isAddParameterCached(int a, int b){
        return addOperationCache.containsKey(OperationParameters.of(a,b));
    }

    public boolean isSubtractParameterCached(int a, int b){
        return subtractOperationCache.containsKey(OperationParameters.of(a,b));
    }

    public boolean isMultiplyParameterCached(int a, int b){
        return multiplyOperationCache.containsKey(OperationParameters.of(a,b));
    }

    public boolean isDivideParameterCached(int a, int b){
        return divideOperationCache.containsKey(OperationParameters.of(a,b));
    }
}
