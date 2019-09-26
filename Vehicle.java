package com.week5;

public class Vehicle {
    private int tires;
    protected String name;

    public Vehicle(int tires){
        this.tires=tires;
    }

    public int getTires(){
        return tires;
    }

    public void setTires(int tires){
        this.tires=tires;
    }

    public String vehicleShape(String shape){
        return shape;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "tires=" + tires +
                ", name='" + name + '\'' +
                '}';
    }
}
