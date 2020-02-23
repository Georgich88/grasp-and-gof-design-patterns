package com.foxminded.isaev.chainofresponsibility.emergencyservices;

public class EmergencyServiceFactory {

    public static EmergencyService createEmergencyServiceChain() {
        var ambulance = new Ambulance();
        ambulance.setNext(new FireDepartment())
                .setNext(new Police());

        return ambulance;
    }

}
