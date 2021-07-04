package com.company.devices;

import com.company.creatures.Human;

public abstract class Car extends device {
    public double millage;
    public String color;
    public double engineVolume;
    public double value;


    public Car(String producer, String model, Integer yearOfProduction) {
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
        System.out.println("Trun car on");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        Integer indexHBuyer = null;
        Integer indexHSeller = null;

        for (int i = 0; i < seller.Garage.size(); i++) {
            if (seller.Garage.get(i) != null) {
                if (seller.Garage.get(i).hashCode() == this.hashCode()) {
                    indexHSeller = i;
                    break;
                }
            }
        }

        int j = 0;
        while (buyer.Garage.size()> j) {
            if (buyer.Garage.get(j) == null) {
                indexHBuyer = j;
                break;
            }
            j++;
        }
        if (indexHSeller == null) {
            System.out.println("No car for sale found!");
        } else if (indexHBuyer == null) {
            System.out.println("No space in garage you cant buy another car");
        } else if (buyer.cash < price) {
            System.out.println("You have no money to buy that car");
        } else {

            System.out.println(buyer.firstName + " bought " + this.producer + " " + this.model + " from " + seller.firstName + " for " + price);
            boolean u = false;
            buyer.setCar(seller.getCar(indexHSeller), u);
            boolean usun = true;
            seller.setCar(buyer.getCar(indexHBuyer),usun);
            buyer.cash -= price;
            seller.cash += price;
        }
    }
    public abstract void refuel();


}

