package com.foxminded.isaev.mediator.people;

import com.foxminded.isaev.mediator.callcenter.CallCenterCommand;
import com.foxminded.isaev.mediator.callcenter.CallCenterMediator;

public abstract class Person {

    private CallCenterMediator mediator;
    private String name;

    public Person(CallCenterMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(CallCenterCommand command, String msg);

    public abstract void receive(CallCenterCommand command, String msg);

    public String getName() {
        return name;
    }


    public CallCenterMediator getMediator() {
        return mediator;
    }
}
