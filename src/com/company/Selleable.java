package com.company;

import com.company.creatures.Human;

public interface Selleable {
    public void sell(Human seller, Human buyer, Double price);
}
