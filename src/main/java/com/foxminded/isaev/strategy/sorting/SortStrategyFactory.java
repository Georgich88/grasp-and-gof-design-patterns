package com.foxminded.isaev.strategy.sorting;

public class SortStrategyFactory {

    public static SortStrategy choiceStrategy(boolean isCollectionAlmostSorted ){

        if (isCollectionAlmostSorted){
            return new BubbleSortStrategy();
        } else {
            return new QuickSortStrategy();
        }

    }


}
