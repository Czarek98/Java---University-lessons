package com.company.creatures;

import com.company.Edible;
import com.company.Saleable;

public class FarmAnimal extends Animal implements Saleable, Edible {
    public FarmAnimal(String species) {
        super(species);
    }

    public String toString() {
        return "Farm Animal" + super.toString();
    }

    @Override
    public void beEaten() {

    }
}
