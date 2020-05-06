package com.company.devices;

import com.company.Saleable;

public abstract class Device implements Saleable {
    public final String brand;
    public final String model;
    public final Integer yearOfproduction;
    public Double prize = 12000.0;

    public Device(String brand, String model, Integer yearOfproduction) {
        this.brand = brand;
        this.model = model;
        this.yearOfproduction = yearOfproduction;
    }

    public String toString() {
        return brand + " " + model;
    }

    public abstract void turnON();

}