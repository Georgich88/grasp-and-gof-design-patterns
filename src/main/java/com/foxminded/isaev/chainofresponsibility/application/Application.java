package com.foxminded.isaev.chainofresponsibility.application;

import com.foxminded.isaev.chainofresponsibility.emergencyservices.EmergencyServiceFactory;

public class Application {

    public static void main(String[] args) {

        var emergencyService = EmergencyServiceFactory.createEmergencyServiceChain();
        System.out.println(emergencyService.call("fire"));
        System.out.println(emergencyService.call("first aim"));
        System.out.println(emergencyService.call("police"));
        System.out.println(emergencyService.call("grocery"));
    }
}
