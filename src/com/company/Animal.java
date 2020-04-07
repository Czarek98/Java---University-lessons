package com.company;

import java.io.File;

public class Animal {
    String name;
    final String species;
    private Double weight;
    File pic;

    static final Double DEFAULT_DOG_WEIGHT = 8.0;
    static final Double DEFAULT_LION_WEIGHT = 120.0;
    static final Double DEFAULT_MOUSE_WEIGHT = 0.05;

    public Animal(String species) {
        this.species = species;
        if(species=="dog"){
            this.weight=DEFAULT_DOG_WEIGHT;
        }
        else if(species=="lion"){
            this.weight=DEFAULT_LION_WEIGHT;
        }else if(species=="mouse"){
            this.weight=DEFAULT_MOUSE_WEIGHT;
        }

    }

    void feed() {
        if (weight!=1 && weight>0) {
            //System.out.println("Sorry you cant feed your dead pet.");
            weight++;
            System.out.println("thx for food bro, my weight is now " + weight);
        }
        else {
            System.out.println("Sorry you cant feed your dead pet.");
        }
    }

    void walk(){
        if (weight!=1 && weight>0) {
            weight--;
            System.out.println("thx for food bro, my weight is now" + weight);
            //System.out.println("Sorry you cant walk.");
        }
        else
        {
            System.out.println("Sorry you cant walk.");
        }
    }
    public String toString(){
        return "Pet " + this.name + " " + this.species + " " + this.weight;
    }

}
