package com.example.ClockheartBackend.models;

import java.util.ArrayList;

public class Player {

//    private Long id;
    private String name;
    private int healthPoints;
    private int intelligence;
    private int strength;
    private int charisma;
    private int currency;
    private String type;
    private ArrayList<Item> items;

    public Player(String name, int healthPoints, int intelligence, int strength, int charisma, String type) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.intelligence = intelligence;
        this.strength = strength;
        this.charisma = charisma;
        this.currency = 10;
        this.type = type;
        this.items = new ArrayList<Item>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public String getType() {
        return type;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    public boolean buyItem(Item item) {
        if (currency >= item.getValue()){
            currency -= item.getValue();
            this.items.add(item);
            return true;
        }
        return false;
    }
}
