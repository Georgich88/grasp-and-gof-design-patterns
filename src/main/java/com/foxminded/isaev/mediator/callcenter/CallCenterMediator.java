package com.foxminded.isaev.mediator.callcenter;

import com.foxminded.isaev.mediator.people.Worker;

public interface CallCenterMediator {

    void send(CallCenterCommand command, String msg);

    void addWorker(Worker worker);

}
