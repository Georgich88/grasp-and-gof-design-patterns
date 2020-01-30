package com.foxminded.isaev.singleton.application;

import com.foxminded.isaev.singleton.maginccoin.MagicCoin;

public class Application {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            var coin = MagicCoin.getInstance();
            System.out.println("Coin with face value: " + coin.getFaceValue());
        }
    }

}
