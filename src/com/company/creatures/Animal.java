package com.company.creatures;

import com.company.Feedable;
import com.company.Saleable;

import java.io.File;

public abstract class Animal implements Saleable, Feedable {
    static final Double DEFAULT_COW_WEIGHT = 200.0;
    static final Double DEFAULT_PIG_WEIGHT = 100.0;
    public final String species;
    File pic;

    static final Double DEFAULT_DOG_WEIGHT = 8.0;
    static final Double DEFAULT_LION_WEIGHT = 120.0;
    static final Double DEFAULT_MOUSE_WEIGHT = 0.05;
    public String name;
    protected Double weight;
    public final Double foodWeight;
    public final Double DEFAULT_DOG_FOODWEIGHT = 8.0;
    public final Double DEFAULT_LION_FOODWEIGHT = 8.0;
    public final Double DEFAULT_MOUSE_FOODWEIGHT = 8.0;
    public final Double DEFAULT_COW_FOODWEIGHT = 8.0;
    public final Double DEFAULT_PIG_FOODWEIGHT = 8.0;


    public Animal(String species, Double foodWeight) {
        this.species = species;
        switch (species) {
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                this.foodWeight = DEFAULT_DOG_FOODWEIGHT;
                break;
            case "lion":
                this.weight = DEFAULT_LION_WEIGHT;
                this.foodWeight = DEFAULT_LION_FOODWEIGHT;
                break;
            case "mouse":
                this.weight = DEFAULT_MOUSE_WEIGHT;
                this.foodWeight = DEFAULT_MOUSE_FOODWEIGHT;
                break;
            case "cow":
                this.weight = DEFAULT_COW_WEIGHT;
                this.foodWeight = DEFAULT_COW_FOODWEIGHT;
                break;
            case "pig":
                this.weight = DEFAULT_PIG_WEIGHT;
                this.foodWeight = DEFAULT_PIG_FOODWEIGHT;
                break;
        }

    }


    public void feed() {
        if (weight != 1 && weight > 0) {
            //System.out.println("Sorry you cant feed your dead pet.");
            weight++;
            System.out.println("thx for food bro, my weight is now " + weight);
        } else {
            System.out.println("Sorry you cant feed your dead pet.");
        }
    }

    public void walk() {
        if (weight != 1 && weight > 0) {
            weight--;
            System.out.println("thx for food bro, my weight is now" + weight);
            //System.out.println("Sorry you cant walk.");
        } else {
            System.out.println("Sorry you cant walk.");
        }
    }

    public String toString() {
        return "Pet " + this.name + " " + this.species + " " + this.weight;
    }


    @Override
    public void Sell(Human seller, Human buyer, Double prize) throws Exception {
        if (this instanceof Human) {
            throw new Exception("no slavery!");
        } else {
            if (buyer.getSalary() >= prize) {
                if (seller.pet == this) {
                    buyer.pet = this;
                    seller.pet = null;
                    buyer.setSalary(buyer.getSalary() - prize);
                    seller.setSalary(seller.getSalary() + prize);
                } else {
                    throw new Exception("not your dog ");
                }
            } else {
                throw new Exception("you too poor buddy");
            }

        }
    }
}

