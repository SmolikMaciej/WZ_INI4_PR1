package com.company.creatures;

import com.company.Selleable;

public abstract class Animal implements Selleable{
    final public String species;
    private Double weight;
    public String Name;

    public String getSpecies() {
        return species;
    }

    public Double getWeight() {
        return weight;
    }



    public Animal(String spieces) {
        this.species = spieces;

        switch (this.species) {
            case "canis":
                this.weight = 12.5;
                break;
            case "cate":
                this.weight = 5.0;
                break;
            case "Peppa pig":
                this.weight = 30.0;
                break;
        }
    }

    public void feed() {
        this.weight++;
    }

    public void takeForAWalk() {
        if (this.weight > 0){
        this.weight--;
        } else {
            System.out.println("Now u late moron");
        }
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(this instanceof Human){
            System.out.println("Human selling is illegal but fun tho");
        }

        else if(seller.pet != this){
            System.out.println("U got no pet m8");
        }
        else if(buyer.cash < price){
            System.out.println("Your broke");
        }else{
            buyer.pet = this;
            seller.pet = null;
            buyer.cash -= price;
            seller.cash += price;
            System.out.println("U got new car");
        }
    }
}

class FarmAnimal implements Edible{
    @Override
    public void beEaten() {

    }
}
class Pet {
}
