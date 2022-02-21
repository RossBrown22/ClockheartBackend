package com.example.ClockheartBackend.models;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Attack extends Item{

    @Column(name = "damage")
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
