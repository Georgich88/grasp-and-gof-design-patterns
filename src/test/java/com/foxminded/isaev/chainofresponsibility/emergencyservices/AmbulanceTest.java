package com.foxminded.isaev.chainofresponsibility.emergencyservices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmbulanceTest {

    @Test
    void shouldCallAmbulance() {

        var ambulance = new Ambulance();
        assertEquals("Ambulance car is on its way", ambulance.call("first aim"));

    }
}