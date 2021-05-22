package com.company;

public class Car {
    public final String producer;
    public final String model;
    public double millage;
    public String color;
    public double engineVolume;

    public Car(String producer, String model){
        this.producer = producer;
        this.model = model;
    }

    public Car(String producer, String model, double millage, String color, double engineVolume){
        this.producer = producer;
        this.model = model;
        this.millage = millage;
        this.color = color;
        this.engineVolume = engineVolume;
    }
}
