package com.week5;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private int nativeResolution;

    public Monitor(String model, String manufacturer,
                   int size, int nativeResolution){
        this.model=model;
        this.manufacturer=manufacturer;
        this.size=size;
        this.nativeResolution=nativeResolution;
    }

    public Monitor() {

    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public int getNativeResolution() {
        return nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + " " + y
        + " in color " + color);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", size=" + size +
                ", nativeResolution=" + nativeResolution +
                '}';
    }
}
