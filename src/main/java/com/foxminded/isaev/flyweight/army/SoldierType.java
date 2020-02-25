package com.foxminded.isaev.flyweight.army;

public class SoldierType extends UnitType {

    private String rank = "";

    public SoldierType(byte[] texture, byte[] sound, String rank) {
        super(texture, sound);
        this.rank = rank;
    }
}
