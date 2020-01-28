package com.foxminded.isaev.prototype.application;

import com.foxminded.isaev.prototype.cars.VehiclePrototypeFactory;
import com.foxminded.isaev.prototype.cars.VehicleType;

public class Application {

    public static void main(String[] args){

        try
        {
            var car  = VehiclePrototypeFactory.createVehicle(VehicleType.CAR);
            System.out.println(car);

            var minivan  = VehiclePrototypeFactory.createVehicle(VehicleType.MINIVAN);
            System.out.println(minivan);

            var truck = VehiclePrototypeFactory.createVehicle(VehicleType.TRUCK);
            System.out.println(truck );

        }
        catch (CloneNotSupportedException e)
        {
            System.out.println(e.getMessage());
        }

    }

}
