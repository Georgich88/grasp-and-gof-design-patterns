package com.foxminded.isaev.observer.subjects;

import com.foxminded.isaev.observer.states.Message;
import com.foxminded.isaev.observer.states.StormWarning;
import com.foxminded.isaev.observer.subscribers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Storm implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String name;
    private int level;

    public Storm(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void attach(Observer observer) {
        if (this.level >= observer.getMinimumWarningLevel()) {
            observers.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyUpdate(String messageText) {
        Message message = new StormWarning(messageText);
        this.observers.forEach(observer -> observer.update(message));
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }
}
