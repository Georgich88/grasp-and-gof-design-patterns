package com.foxminded.isaev.observer.subscribers;

import com.foxminded.isaev.observer.states.Message;

public interface Observer {

    void update(Message message);

    int getMinimumWarningLevel();

}
