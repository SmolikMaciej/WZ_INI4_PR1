package com.company;

public class Animal {
    final String species = "";
    private Double weight = 0.0;

    public String getSpecies() {
        return species;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Animal(String species) {
        if (species == "jamnik") {this.weight = 15.0;}
        else if (species == "owczarek") {this.weight = 20.0;}


    }

    public void feed() {
        this.weight++;
    }

    public void takeForAWalk() {
        if (this.weight > 0){
        this.weight--;
        } else {
            System.out.println("teraz już za późno dzbanie");
        }
    }

}
