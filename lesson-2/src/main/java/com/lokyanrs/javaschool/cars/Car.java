package com.lokyanrs.javaschool.cars;

public class Car {
    private String model;
    private CarType type;

    public Car(String model, CarType type) {
        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public CarType getType() {
        return type;
    }

    public Car setType(CarType type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return model;
    }
}
