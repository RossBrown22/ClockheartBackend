package com.example.ClockheartBackend.models;

import com.example.ClockheartBackend.behaviours.IOwn;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shop")
public class Shop implements IOwn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "owner")
    @JsonIgnoreProperties({"owner"})
    private List<Item> items;

    public Shop(String name) {
        this.items = new ArrayList<>();
        this.name = name;
    }

    public List<Item> getItems() {
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
