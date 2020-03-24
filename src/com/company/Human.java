package com.company;

public class Human {
    String firstname;
    String lastname;
    Phone phone;
    Animal pet;
    Car car;

    private  Double salary = 100.0;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary<0){
            System.out.println("Sorry im not an idiot ");
        }
        else {
            System.out.println("my earn is ");

        }
        this.salary = salary;
    }
}


