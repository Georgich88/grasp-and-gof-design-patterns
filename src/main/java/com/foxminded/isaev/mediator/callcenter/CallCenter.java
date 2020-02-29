package com.foxminded.isaev.mediator.callcenter;

import com.foxminded.isaev.mediator.people.Deliverer;
import com.foxminded.isaev.mediator.people.Repairman;
import com.foxminded.isaev.mediator.people.TaxiDriver;
import com.foxminded.isaev.mediator.people.Worker;

import java.util.HashMap;
import java.util.Map;

public class CallCenter implements CallCenterMediator {

    private Map<CallCenterCommand, Worker> workers = new HashMap<>();

    @Override
    public void send(CallCenterCommand command, String msg) {
        workers.computeIfPresent(command, (c, w) -> {
            w.receive(command, msg);
            return w;
        });
    }

    public Worker addDeliverer(String name) {
        var deliverer = new Deliverer(this, name);
        workers.put(deliverer.getSupportedCommand(), deliverer);
        return deliverer;
    }

    public Worker addRepairman(String name) {
        var repairman = new Repairman(this, name);
        workers.put(repairman.getSupportedCommand(), repairman);
        return repairman;
    }

    public Worker addTaxiDriver(String name) {
        var taxiDriver = new TaxiDriver(this, name);
        workers.put(taxiDriver.getSupportedCommand(), taxiDriver);
        return taxiDriver;
    }

    @Override
    public void addWorker(Worker worker) {
        workers.put(worker.getSupportedCommand(), worker);
    }

}
