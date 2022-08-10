package com.surgecross.sjgt.model;

import java.util.ArrayList;

public class Dealership {
    private final long id;
    private String name;
    private String city;

    private ArrayList<Car> cars;

    public Dealership(long id, String name, String city, ArrayList<Car> cars) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.cars = cars;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
}
