package com.sparta.nested;

public class Car {
    private String make;
    private String model;
    private int numDoors;

    public Car(String make, String model, int numDoors) {
        this.make = make;
        this.model = model;
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numDoors=" + numDoors +
                '}';
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
}
