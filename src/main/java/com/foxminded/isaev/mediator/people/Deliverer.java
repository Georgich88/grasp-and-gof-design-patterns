package com.foxminded.isaev.mediator.people;

import com.foxminded.isaev.mediator.callcenter.CallCenterCommand;
import com.foxminded.isaev.mediator.callcenter.CallCenterMediator;

public class Deliverer extends Worker {

    public Deliverer(CallCenterMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public CallCenterCommand getSupportedCommand() {
        return CallCenterCommand.CALL_FLOWER_DELIVERY;
    }

    @Override
    public void send(CallCenterCommand command, String msg) {
        getMediator().send(command, msg);
    }

    @Override
    public void receive(CallCenterCommand command, String msg) {
        System.out.println(this.getName() + ": I'm delivering stuff to " + msg);
    }
}
