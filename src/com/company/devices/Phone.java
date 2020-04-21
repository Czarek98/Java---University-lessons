package com.company.devices;

public class Phone extends Device {

    public Phone(String brand, String model, Integer yearOfproduction) {
        super(brand, model, yearOfproduction);

    }

    @Override
    public void turnON() {
        System.out.println("Hello, your battery is 25%");
    }

    @Override
    public void Sell() {

    }
}
