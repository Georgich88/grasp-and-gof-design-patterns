package com.foxminded.isaev.proxy.application;

import com.foxminded.isaev.proxy.client.CalculationOperationException;
import com.foxminded.isaev.proxy.client.CalculatorClient;
import com.foxminded.isaev.proxy.client.CalculatorClientProxy;

public class Application {

    public static void main(String[] args) throws CalculationOperationException {

        CalculatorClient calculator = new CalculatorClientProxy();

        int a = 5, b = 6;

        System.out.printf("%d + %d = %d\n", a, b, calculator.add(a, b));
        System.out.printf("%d - %d = %d\n", b, a, calculator.subtract(b, a));
        System.out.printf("%d * %d = %d\n", a, b, calculator.multiply(a, b));
        System.out.printf("%d / %d = %d\n", a, b, calculator.divide(a, b));

        System.out.printf("%d + %d = %d\n", a, b, calculator.add(a, b));
        System.out.printf("%d - %d = %d\n", b, a, calculator.subtract(b, a));
        System.out.printf("%d * %d = %d\n", a, b, calculator.multiply(a, b));
        System.out.printf("%d / %d = %d\n", a, b, calculator.divide(a, b));


    }

}
