package com.foxminded.isaev.mediator.people;

import com.foxminded.isaev.mediator.callcenter.CallCenterCommand;
import com.foxminded.isaev.mediator.callcenter.CallCenterMediator;

public abstract class Worker extends Person {

    public Worker(CallCenterMediator mediator, String name) {
        super(mediator, name);
        mediator.addWorker(this);
    }

    public abstract CallCenterCommand getSupportedCommand();
}
