package com.foxminded.isaev.observer.application;

import com.foxminded.isaev.observer.subjects.Storm;
import com.foxminded.isaev.observer.subscribers.AirportObserver;
import com.foxminded.isaev.observer.subscribers.Observer;
import com.foxminded.isaev.observer.subscribers.RoadServiceObserver;
import com.foxminded.isaev.observer.subscribers.SchoolObserver;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        var observers = new ArrayList<Observer>(3);
        observers.add(new AirportObserver("Zhuliany"));
        observers.add(new SchoolObserver("Primary School Stockton"));
        observers.add(new RoadServiceObserver("Alabama road service"));

        var hurricaneKatherine = new Storm("Hurricane Katherine", 4);
        observers.forEach(hurricaneKatherine::attach);

        hurricaneKatherine.notifyUpdate("First storm alarm");
        hurricaneKatherine.detach(observers.get(1));
        hurricaneKatherine.notifyUpdate("Second storm alarm");
    }

}