package com.company.devices;

public class Car extends Device {
   public String plates;


    public  Double prize = 12000.0;


    public Car(String brand, String model, Integer yearOfproduction) {
        super(brand, model, yearOfproduction);

    }

    public String toString(){
        return "Car " + this.brand + " " + this.model + " " + this.yearOfproduction;
    }
}
