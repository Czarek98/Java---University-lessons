package com.company;

import com.company.devices.Car;
import com.company.devices.Device;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Brutus";


        //Animal my_dog = new Animal();
        //my_dog.name = "Brutus";


        Animal lion= new Animal("lion");
        lion.name = "leo";

        //dog.feed();


        Human me = new Human();
        me.firstname = "Czarek";
        me.lastname = "Bohdanowicz";
        me.pet = dog;

        Human wife = new Human();
        me.firstname = "Żona";
        me.lastname = "Moja";


        //out.println(me.getCar().brand + " "+me.getCar().model);



        //out.println(me.car.brand);
        out.println("I earn " + me.getSalary());
        me.setSalary(200.0);
        out.println("I earn " + me.getSalary());
        me.setSalary(1000.0);
        out.println("I earn " + me.getSalary());

        Car alfa = new Car("Alfa Romeo",
                "147",
                2004);


        //wife.setCar(new Car("Alfa Romeo", "147", 2004));

        me.setCar(alfa);
        wife.setCar(alfa);

        System.out.println(me);
        System.out.println(me.getCar());

        Device fridge = new Device("samsung", "9000", 2020) {
            @Override
            public void Sell() {

            }

            @Override
            public void turnON() {

            }
        };
        out.println(fridge);

        //me.Sell();
        //me.pet.Sell();

        //System.out.println(wife);
        //System.out.println(wife.getCar());




        //me.pet.feed();

        //me.pet.walk();
        //me.pet.walk();
        //me.pet.walk();
        //me.pet.walk();
        //me.pet.walk();
        //me.pet.walk();
        //me.pet.walk();
        //me.pet.walk();
        //me.pet.walk();

        //System.out.println(me.pet.name);

    }
}



