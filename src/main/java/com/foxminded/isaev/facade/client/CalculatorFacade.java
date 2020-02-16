package com.foxminded.isaev.facade.client;

import com.foxminded.isaev.facade.calculatoruri.CalculatorLocator;
import com.foxminded.isaev.facade.calculatoruri.CalculatorSoap;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.Formatter;

public class CalculatorFacade {

    private static final CalculatorLocator CALCULATOR_LOCATOR = new CalculatorLocator();

    private static final String EXCEPTION_MESSAGE_ADDITION_TEMPLATE = "Cannot add up the numbers (%d + %d)";
    private static final String EXCEPTION_MESSAGE_SUBTRACTION_TEMPLATE = "Cannot subtract the numbers (%d - %d)";
    private static final String EXCEPTION_MESSAGE_MULTIPLICATION_TEMPLATE = "Cannot add up the numbers (%d + %d)";
    private static final String EXCEPTION_MESSAGE_DIVISION_TEMPLATE = "Cannot add up the numbers (%d + %d)";
    private static final Formatter EXCEPTION_MESSAGE_FORMATTER = new Formatter();

    public static int add(int a, int b) throws CalculationOperationException {

        int sum;

        try {
            CalculatorSoap calculatorSoap = CALCULATOR_LOCATOR.getCalculatorSoap();
            sum = calculatorSoap.add(a, b);
        } catch (ServiceException | RemoteException e) {
            throw new CalculationOperationException(generateExceptionMessage(EXCEPTION_MESSAGE_ADDITION_TEMPLATE, a, b), e);
        }

        return sum;
    }

    public static int subtract(int a, int b) throws CalculationOperationException {

        int difference;

        try {
            CalculatorSoap calculatorSoap = CALCULATOR_LOCATOR.getCalculatorSoap();
            difference = calculatorSoap.subtract(a, b);
        } catch (ServiceException | RemoteException e) {
            throw new CalculationOperationException(generateExceptionMessage(EXCEPTION_MESSAGE_SUBTRACTION_TEMPLATE, a, b), e);
        }

        return difference;
    }

    public static int multiply(int a, int b) throws CalculationOperationException {

        int product;

        try {
            CalculatorSoap calculatorSoap = CALCULATOR_LOCATOR.getCalculatorSoap();
            product = calculatorSoap.multiply(a, b);
        } catch (ServiceException | RemoteException e) {
            throw new CalculationOperationException(generateExceptionMessage(EXCEPTION_MESSAGE_MULTIPLICATION_TEMPLATE, a, b), e);
        }

        return product;
    }

    public static int divide(int a, int b) throws CalculationOperationException {

        int quotient;

        try {
            CalculatorSoap calculatorSoap = CALCULATOR_LOCATOR.getCalculatorSoap();
            quotient = calculatorSoap.subtract(a, b);
        } catch (ServiceException | RemoteException e) {
            throw new CalculationOperationException(generateExceptionMessage(EXCEPTION_MESSAGE_DIVISION_TEMPLATE, a, b), e);
        }

        return quotient;
    }

    private static String generateExceptionMessage(String format, int a, int b) {
        return EXCEPTION_MESSAGE_FORMATTER.format(format, a, b).toString();
    }
}
