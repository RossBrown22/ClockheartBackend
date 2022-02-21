package com.example.ClockheartBackend.models;

public class Healing extends Item{

    private int healing;

    public Healing(String name, int value, int healing) {
        super(name, value);
        this.healing = healing;
    }

    public int getHealing() {
        return healing;
    }

    public void setHealing(int healing) {
        this.healing = healing;
    }
}
