package com.foxminded.isaev.abstractfactory.cafe;

import com.foxminded.isaev.abstractfactory.dishes.CuisineType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CafeFactoryProducerTest {

    @Test
    public void shouldCreateUkrainianMenu(){
        var ukrainianMenu = CafeFactoryProducer.generateNationalCuisineFactory(CuisineType.UKRANIAN);
        assertTrue(ukrainianMenu instanceof  UkrainianCuisineFactory);
    }

    @Test
    public void shouldCreateJapaneseMenu(){
        var americanMenu = CafeFactoryProducer.generateNationalCuisineFactory(CuisineType.AMERIACAN);
        assertTrue(americanMenu instanceof  AmericanCuisineFactory);
    }

    @Test
    public void shouldCreateAmericanMenu(){
        var japaneseMenu = CafeFactoryProducer.generateNationalCuisineFactory(CuisineType.JAPANESE);
        assertTrue(japaneseMenu instanceof  JapaneseCuisineFactory);
    }

}
