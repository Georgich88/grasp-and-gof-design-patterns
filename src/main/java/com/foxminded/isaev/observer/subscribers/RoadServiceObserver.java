package com.foxminded.isaev.observer.subscribers;

import com.foxminded.isaev.observer.states.Message;

import java.util.StringJoiner;

public class RoadServiceObserver implements Observer {

    private String name;
    private static final int MINIMUM_WARNING_LEVEL = 3;

    public RoadServiceObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Message message) {

        System.out.println(new StringJoiner(": ")
                .add("name='" + this.name + "'")
                .add("message='" + message.getMessageContent() + "'")
                .toString());
    }

    @Override
    public int getMinimumWarningLevel() {
        return MINIMUM_WARNING_LEVEL;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", RoadServiceObserver.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }
}
