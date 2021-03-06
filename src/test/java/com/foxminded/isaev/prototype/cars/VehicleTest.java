package com.foxminded.isaev.prototype.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class VehicleTest {

    @Test
    public void shouldCreateVehicles(){

        var car  = new Vehicle(VehicleType.CAR, "red", "123 VN 09");
        var minivan  = new Vehicle(VehicleType.MINIVAN, "red", "123 VN 09");
        var truck = new Vehicle(VehicleType.TRUCK, "red", "123 VN 09");

        assertEquals("Vehicle{type=CAR, color='red', number='123 VN 09'}", car.toString());
        assertEquals("Vehicle{type=MINIVAN, color='red', number='123 VN 09'}", minivan.toString());
        assertEquals("Vehicle{type=TRUCK, color='red', number='123 VN 09'}", truck.toString());


    }

}
