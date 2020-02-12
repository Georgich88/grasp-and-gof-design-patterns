package com.foxminded.isaev.bridge.courses;

import com.foxminded.isaev.bridge.cafe.Cuisine;

public class Dessert extends Course {

    public Dessert(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public void cook() {
        this.cuisine.cookDessert();
    }
}
