package com.surgecross.sjgt.model;

public class Car {
    private final long id;
    private final String make;
    private final String model;
    private int mileage;
    private boolean isConvertible;


    public Car(long id, String make, String model, int mileage, boolean isConvertible) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.isConvertible = isConvertible;
    }

    public long getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }
}
