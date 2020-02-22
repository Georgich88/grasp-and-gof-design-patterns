package com.foxminded.isaev.flyweight.army;

public abstract class UnitType {

    public UnitType(byte[] texture, byte[] sound) {
        this.texture = texture;
        this.sound = sound;
    }

    private byte[] texture;
    private byte[] sound;

}
