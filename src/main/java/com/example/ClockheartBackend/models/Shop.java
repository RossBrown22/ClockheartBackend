package com.example.ClockheartBackend.models;

import java.util.ArrayList;

public class Shop {

//    private Long id;
    private ArrayList<Item> items;

    public Shop() {
        this.items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void sellItem(Item item){
        this.items.remove(item);
    }

    public void addItem(Item item){
        this.items.add(item);
    }
}
