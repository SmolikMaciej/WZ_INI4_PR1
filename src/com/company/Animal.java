package com.company;

public class Animal {
    final public String species;
    private Double weight;
    String name;

    void printName(){
        System.out.println("my name is: " + this.name);
    }

    void printNameAndOwner(String owner){
        System.out.println(owner + " has " + this.name);
    }
}
