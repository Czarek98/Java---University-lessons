package com.company;

import com.company.creatures.Human;

public interface Saleable {
    void Sell(Human seller, Human buyer, Double prize) throws Exception;
}

