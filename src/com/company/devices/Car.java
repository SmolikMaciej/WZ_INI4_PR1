package com.company.devices;

import com.company.creatures.Human;

public abstract class Car extends device {
    public double millage;
    public String color;
    public double engineVolume;
    public double value;


    public Car (String producer, String model, Integer yearOfProduction){
        super(producer, model, yearOfProduction);
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }


    public boolean equals(Object o) {
        if (o instanceof Car) {
            Car car = (Car) o;
            if (car.producer.equals(this.producer)
                && car.model.equals(this.model)
                && car.millage == this.millage)
            return true;
        else
            return false;
        } else {
            return false;
        }
    }

    public String toString() {
        return this.producer + " " + this.model + " " + this.millage;
    }

    @Override
    public void turnOn() {
        System.out.println("wciśnij przycisk");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }

    public abstract void refuel();

}

