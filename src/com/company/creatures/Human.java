package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    public String firstname;
    public String lastname;
    public Phone phone;
    public Animal pet;
    Double salary = 10000.0;
    private Car car;

    public Human() {
        super("homo sapiens");
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary<0){
            System.out.println("Sorry im not an idiot ");
        }
        else {
            this.salary = salary;
        }

    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String toString() {
        return "Human " + this.firstname + " " + this.lastname + " " + this.pet;
    }


    @Override
    public void feed(Double foodWeight) {

    }
}


