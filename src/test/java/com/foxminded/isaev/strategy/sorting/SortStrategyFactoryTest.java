package com.foxminded.isaev.strategy.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SortStrategyFactoryTest {

    @Test
    void shouldChoiceStrategy() {

        assertTrue(SortStrategyFactory.choiceStrategy(true) instanceof BubbleSortStrategy);
        assertTrue(SortStrategyFactory.choiceStrategy(false) instanceof QuickSortStrategy);

    }
}