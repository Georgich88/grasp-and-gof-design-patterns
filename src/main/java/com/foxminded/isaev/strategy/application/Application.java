package com.foxminded.isaev.strategy.application;

import com.foxminded.isaev.strategy.sorting.SortStrategyFactory;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        var almostSortedList = new ArrayList<>(List.of(1, 3, 2, 4, 5, 7, 9));
        var notAlmostSortedList = new ArrayList<>(List.of(67, 3, 34, 4, 11, 90, 9));

        SortStrategyFactory.choiceStrategy(true)
                .sort(almostSortedList);
        SortStrategyFactory.choiceStrategy(false)
                .sort(notAlmostSortedList);

        System.out.println(almostSortedList);
        System.out.println(notAlmostSortedList);
    }

}
