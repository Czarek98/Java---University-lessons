package com.company;

public class Human {
    String firstname;
    String lastname;
    Phone phone;
    Animal pet;
   private Car car;

    private  Double salary = 100.0;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary<0){
            System.out.println("Sorry im not an idiot ");
        }
        else {
            //System.out.println("my earn is ");
            this.salary = salary;
        }

    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if(car.prize <= this.salary){
            System.out.println("Car was bought by cash");
            this.car=car;
        } else if (car.prize<=this.salary * 12){
            System.out.println("You bought car on credit");
            this.car=car;
        } else {
            System.out.println("Car is too expensive");
        }

    }
    public String toString(){
        return "Human " + this.firstname + " " + this.lastname + " " + this.pet;
    }
}


