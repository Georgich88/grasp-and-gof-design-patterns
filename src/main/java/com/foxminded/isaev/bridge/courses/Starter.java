package com.foxminded.isaev.bridge.courses;

import com.foxminded.isaev.bridge.cafe.Cuisine;

public class Starter extends Course {

    public Starter(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public void cook() {
        this.cuisine.cookStarter();
    }
}
