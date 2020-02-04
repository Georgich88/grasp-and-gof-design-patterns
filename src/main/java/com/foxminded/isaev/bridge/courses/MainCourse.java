package com.foxminded.isaev.bridge.courses;

import com.foxminded.isaev.bridge.cafe.Cuisine;

public class MainCourse extends Course {

    public MainCourse(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public void cook() {
        this.cuisine.cookMainCourse();
    }

}
