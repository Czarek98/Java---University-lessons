package com.company.creatures;

import com.company.Saleable;

public class Pet extends Animal implements Saleable {
    public Pet(String species) {
        super(species);
    }
}
