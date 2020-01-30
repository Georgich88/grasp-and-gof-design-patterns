package com.foxminded.isaev.singleton.maginccoin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class MagicCoinTest {

    @Test
    public void shouldCreateInstances() {
        
        for (int i = 0; i < 10; i++) {
            var coin = MagicCoin.getInstance();
            assertEquals(i, coin.getFaceValue());
        }
        
        assertThrows(RuntimeException.class, () -> {
            MagicCoin.getInstance();
        });

    }

}
