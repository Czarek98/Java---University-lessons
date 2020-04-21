package com.company.devices;

public class Car extends Device {
   public String plates;


    public Car(String brand, String model, Integer yearOfproduction) {
        super(brand, model, yearOfproduction);

    }

    public String toString(){
        return "Car " + this.brand + " " + this.model + " " + this.yearOfproduction;
    }

    @Override
    public void turnON() {
        System.out.println("Turn on engine");
    }

    @Override
    public void Sell() {
        System.out.println("Sold!");
    }
}
