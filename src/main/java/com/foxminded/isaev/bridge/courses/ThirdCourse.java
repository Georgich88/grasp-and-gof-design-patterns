package com.foxminded.isaev.bridge.courses;

import com.foxminded.isaev.bridge.cafe.Cuisine;

public class ThirdCourse extends Course {

    public ThirdCourse(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public void cook() {
        this.cuisine.cookThirdCourse();
    }
}
