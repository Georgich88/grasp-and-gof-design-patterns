package com.foxminded.isaev.observer.subjects;

import com.foxminded.isaev.observer.states.StormWarning;
import com.foxminded.isaev.observer.subscribers.AirportObserver;
import com.foxminded.isaev.observer.subscribers.Observer;
import com.foxminded.isaev.observer.subscribers.RoadServiceObserver;
import com.foxminded.isaev.observer.subscribers.SchoolObserver;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StormTest {


    @Test
    void shouldAttach() {

        var observers = new ArrayList<Observer>(3);
        observers.add(new AirportObserver("Zhuliany"));
        observers.add(new SchoolObserver("Primary School Stockton"));
        observers.add(new RoadServiceObserver("Alabama road service"));

        var hurricaneKatherine = new Storm("Hurricane Katherine", 4);
        observers.forEach(hurricaneKatherine::attach);

        assertEquals(2, hurricaneKatherine.getObservers().size());

    }

    @Test
    void shouldDetach() {

        var observers = new ArrayList<Observer>(3);
        observers.add(new AirportObserver("Zhuliany"));
        observers.add(new SchoolObserver("Primary School Stockton"));
        observers.add(new RoadServiceObserver("Alabama road service"));

        var hurricaneKatherine = new Storm("Hurricane Katherine", 4);
        observers.forEach(hurricaneKatherine::attach);

        hurricaneKatherine.notifyUpdate("First storm alarm");
        hurricaneKatherine.detach(observers.get(1));
        assertEquals(1, hurricaneKatherine.getObservers().size());


    }

    @Test
    void shouldNotifyUpdate() {

        var hurricaneKatherine = Mockito.spy(new Storm("Hurricane Katherine", 4));
        var spySchoolObserver = Mockito.spy(new SchoolObserver("Primary School Stockton"));

        hurricaneKatherine.attach(spySchoolObserver);
        hurricaneKatherine.notifyUpdate("First storm alarm");

        Mockito.verify(spySchoolObserver, Mockito.atLeastOnce()).update(new StormWarning("First storm alarm"));

    }
}