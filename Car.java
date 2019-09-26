package com.week5;

public class Car extends Vehicle {
    private String shape;

    public Car(int tires) {
        super(tires);
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String vehicleShape(String shape){
        return shape;
    }

    @Override
    public String toString() {
        return "Car{" +
                "shape='" + shape + '\'' +
                '}';
    }
}
