package com.foxminded.isaev.factorymethod.dishes;

public class Spaghetti extends Dish {

    private static final CuisineType CUISINE_TYPE = CuisineType.ITALIAN;
    private static final long DEFAULT_COOKING_TIME = 20;

    @Override
    public long calculateEstimatedCookingTime(double kitchenBusyRate) {
        long estimatedCookingTime = (long) (DEFAULT_COOKING_TIME * kitchenBusyRate);
        setEstimatedCookingTime(estimatedCookingTime);
        return getEstimatedCookingTime();
    }

    public static CuisineType getCuisineType() {
        return CUISINE_TYPE;
    }
}
