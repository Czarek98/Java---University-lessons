package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Pet("dog");
        dog.name = "Brutus";

        Animal cow = new FarmAnimal("cow");
        Animal pig = new FarmAnimal("pig");

        Human me = new Human();
        me.firstname = "Czarek";
        me.lastname = "Bohdanowicz";

        me.pet = dog;

        Car alfa = new Car("Alfa Romeo", "147", 2004);

        me.setCar(alfa);

        Human brat = new Human();
        brat.phone = new Phone("Nokia", "3310", 1999);

        try {
            me.getCar().Sell(me, brat, 199.0);
            brat.phone.Sell(brat, me, 5.0);
            me.pet.Sell(me, brat, 2.0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        out.println("Moj samochod " + me.getCar());
        out.println("Samochod brata " + brat.getCar());
        out.println("Moja forsa " + me.getSalary());
        out.println("Forsa brata" + brat.getSalary());
        out.println("moj fon " + me.phone);
        out.println("fon brata " + brat.phone);
        out.println("moj zwierzak " + me.pet);
        out.println("brata zwierzak " + brat.pet);

    }
}


