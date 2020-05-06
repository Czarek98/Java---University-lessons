package com.company.devices;

import com.company.creatures.Human;

public class Car extends Device {

    public Car(String brand, String model, Integer yearOfProduction) {
        super(brand, model, yearOfProduction);
    }

    public String toString() {
        return "Car " + super.toString();
    }

    @Override
    public void turnON() {

    }

    @Override
    public void Sell(Human seller, Human buyer, Double prize) throws Exception {
        if (buyer.getSalary() >= prize) {
            if (seller.getCar() == this) {
                buyer.setCar(this);
                seller.setCar(null);
                buyer.setSalary(buyer.getSalary() - prize);
                seller.setSalary(seller.getSalary() + prize);
                System.out.println("Transaction closed, car " + this + " sold to " + buyer.firstname);
            } else {
                throw new Exception("cannot sell stolen cars :| ");
            }
        } else {
            throw new Exception("not enough money man");
        }
    }

}