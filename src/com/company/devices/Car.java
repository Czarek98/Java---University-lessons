package com.company.devices;

public class Car {
   public final String brand;
   public final String model;
   public final Integer yearOfproduction;
   public String plates;


    public  Double prize = 12000.0;


    public Car(String brand, String model, Integer yearOfproduction) {
        this.brand = brand;
        this.model = model;
        this.yearOfproduction = yearOfproduction;
    }

    public String toString(){
        return "Car " + this.brand + " " + this.model + " " + this.yearOfproduction;
    }
}