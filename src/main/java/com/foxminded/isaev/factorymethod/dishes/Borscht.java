package com.foxminded.isaev.factorymethod.dishes;

public class Borscht extends Dish {

    private static final CuisineType CUISINE_TYPE = CuisineType.UKRANIAN;
    private static final long DEFAULT_COOKING_TIME = 90;
    private static final long BOILING_MEAT_TIME = 30;

    @Override
    public long calculateEstimatedCookingTime(double kitchenBusyRate) {
        long estimatedCookingTime = BOILING_MEAT_TIME + (long) (DEFAULT_COOKING_TIME * kitchenBusyRate);
        setEstimatedCookingTime(estimatedCookingTime);
        return getEstimatedCookingTime();
    }

    public static CuisineType getCuisineType() {
        return CUISINE_TYPE;
    }
}
