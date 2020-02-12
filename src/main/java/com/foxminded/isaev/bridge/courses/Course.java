package com.foxminded.isaev.bridge.courses;

import com.foxminded.isaev.bridge.cafe.Cuisine;

public abstract class Course implements Cookable {

    protected Cuisine cuisine;

    public Course(Cuisine cuisine) {
        this.cuisine = cuisine;
    }
}
