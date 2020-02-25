package com.foxminded.isaev.chainofresponsibility.emergencyservices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmergencyServiceFactoryTest {

    @Test
    void shouldCreateEmergencyServiceChain() {

        var emergencyService = EmergencyServiceFactory.createEmergencyServiceChain();

        assertEquals("Firefighters put out fires", emergencyService.call("fire"));
        assertEquals("Ambulance car is on its way", emergencyService.call("first aim"));
        assertEquals("Policemen are coming", emergencyService.call("police"));
        assertEquals("Please specify request", emergencyService.call("grocery"));

    }
}