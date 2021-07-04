package com.company.devices;

import com.company.Selleable;

public abstract class device implements Selleable {
    public String producer;
    public String model;
    public Integer yearOfProduction;

    public device(String producer,
                  String model,
                  Integer yearOfProduction){
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void turnOn();




}
