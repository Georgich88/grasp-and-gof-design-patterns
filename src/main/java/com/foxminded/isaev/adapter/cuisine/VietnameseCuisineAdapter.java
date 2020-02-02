package com.foxminded.isaev.adapter.cuisine;

public class VietnameseCuisineAdapter implements CuisineAdapter {

    private VietnameseCuisine cuisine;

    public VietnameseCuisineAdapter() {
        this.cuisine = new VietnameseCuisine();
    }

    @Override
    public void cook() {
        this.cuisine.cookVietnameseNoodle();
    }

    @Override
    public void order() {
        this.cuisine.orderVietnameseNoodle();
    }
}
