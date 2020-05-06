package com.company.devices;

import com.company.creatures.Human;

public class Phone extends Device {

    public Phone(String brand, String model, Integer yearOfproduction) {
        super(brand, model, yearOfproduction);

    }

    @Override
    public void turnON() {
        System.out.println("Hello, your battery is 25%");
    }

    @Override
    public void Sell(Human seller, Human buyer, Double prize) throws Exception {
        if (buyer.getSalary() >= prize) {
            if (seller.phone == this) {
                buyer.phone = this;
                seller.phone = null;
                buyer.setSalary(buyer.getSalary() - prize);
                seller.setSalary(seller.getSalary() + prize);
                System.out.println("Transaction closed, phone " + this + " sold to " + buyer.firstname);
            } else {
                throw new Exception("cannot sell stolen phones :| ");
            }
        } else {
            throw new Exception("not enough money man");
        }
    }
}

