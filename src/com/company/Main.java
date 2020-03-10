package com.company;

import java.math.BigDecimal;
import java.sql.SQLOutput;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Akita";


        //Animal my_dog = new Animal();
        //my_dog.name = "Brutus";


        Animal lion= new Animal("lion");
        lion.name = "leo";

        dog.feed();
        lion.feed();

        Human me = new Human();
        me.firstname = "Czarek";
        me.lastname = "Bohdanowicz";
        me.pet = dog;
        //me.phone =

        //me.pet.feed();
        System.out.println(me.pet.name);
        dog.feed();

    }
}



