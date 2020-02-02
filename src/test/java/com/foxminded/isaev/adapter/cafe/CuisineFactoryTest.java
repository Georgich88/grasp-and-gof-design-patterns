package com.foxminded.isaev.adapter.cafe;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.foxminded.isaev.adapter.cuisine.ChineseCuisineAdapter;
import com.foxminded.isaev.adapter.cuisine.CuisineType;
import com.foxminded.isaev.adapter.cuisine.VietnameseCuisineAdapter;
import org.junit.jupiter.api.Test;

public class CuisineFactoryTest {

    @Test
    void shouldCreateCuisine(){

        var chineseCuisine = CuisineFactory.createCuisine(CuisineType.CHINESE);
        assertEquals(ChineseCuisineAdapter.class, chineseCuisine.getClass());

        var vietnameseCuisine = CuisineFactory.createCuisine(CuisineType.VIETNAMESE);
        assertEquals(VietnameseCuisineAdapter.class, vietnameseCuisine.getClass());

    }
}
