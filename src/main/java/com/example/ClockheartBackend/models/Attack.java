package com.example.ClockheartBackend.models;

public class Attack extends Item{

    private int damage;

    public Attack(String name, int value, int damage) {
        super(name, value);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
