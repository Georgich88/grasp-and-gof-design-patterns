package com.foxminded.isaev.facade.application;

import com.foxminded.isaev.facade.client.CalculationOperationException;
import com.foxminded.isaev.facade.client.CalculatorFacade;

public class Application {

    public static void main(String[] args) throws CalculationOperationException {

        int a = 5, b = 6;

        System.out.printf("%d + %d = %d\n", a, b, CalculatorFacade.add(a, b));
        System.out.printf("%d - %d = %d\n", b, a, CalculatorFacade.subtract(b, a));
        System.out.printf("%d * %d = %d\n", a, b, CalculatorFacade.multiply(a, b));
        System.out.printf("%d / %d = %d\n", a, b, CalculatorFacade.divide(a, b));

    }

}
