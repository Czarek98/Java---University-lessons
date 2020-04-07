package com.company.devices;

public class Device {
    public final String brand;
    public final String model;
    public final Integer yearOfproduction;
    public  Double prize = 12000.0;

    public Device(String brand, String model, Integer yearOfproduction) {
        this.brand = brand;
        this.model = model;
        this.yearOfproduction = yearOfproduction;
    }
}
