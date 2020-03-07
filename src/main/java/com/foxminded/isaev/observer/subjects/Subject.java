package com.foxminded.isaev.observer.subjects;

import com.foxminded.isaev.observer.states.Message;
import com.foxminded.isaev.observer.subscribers.Observer;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyUpdate(String message);
}
