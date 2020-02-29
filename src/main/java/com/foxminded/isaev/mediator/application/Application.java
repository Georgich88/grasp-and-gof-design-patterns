package com.foxminded.isaev.mediator.application;

import com.foxminded.isaev.mediator.callcenter.CallCenter;
import com.foxminded.isaev.mediator.callcenter.CallCenterCommand;
import com.foxminded.isaev.mediator.people.Client;

public class Application {

    public static void main(String[] args) {

        var callCenter = new CallCenter();
        callCenter.addDeliverer("Deliverer John");
        callCenter.addRepairman("Repairman George");
        callCenter.addTaxiDriver("Taxi-driver Bill");

        var client1 = new Client(callCenter, "Adam Adams", "Vietnam, Hanoi, Minh Hai, Times City P12.16.16");
        var client2 = new Client(callCenter, "Bill Watson", "California");
        var client3 = new Client(callCenter, "Jon Johns", "Ukraine, Kiev");

        client1.send(CallCenterCommand.CALL_FLOWER_DELIVERY, "I need flowers");
        client2.send(CallCenterCommand.CALL_REPAIRMAN, "Fix my closet");
        client3.send(CallCenterCommand.CALL_TAXI, "Bring me to Kharkiv, ASAP");
    }

}
