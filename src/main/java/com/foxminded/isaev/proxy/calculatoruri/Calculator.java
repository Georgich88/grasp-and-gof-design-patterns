/**
 * Calculator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.foxminded.isaev.proxy.calculatoruri;

public interface Calculator extends javax.xml.rpc.Service {
    public String getCalculatorSoapAddress();

    public CalculatorSoap getCalculatorSoap() throws javax.xml.rpc.ServiceException;

    public CalculatorSoap getCalculatorSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
