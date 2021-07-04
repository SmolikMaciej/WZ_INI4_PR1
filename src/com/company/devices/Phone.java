package com.company.devices;

import com.company.creatures.Human;

public class Phone extends device implements Rechargeable{
    String producent;
    String model;
    Double screenSize;
    String os;

    public Phone(String producer, String model, Integer yearOfProduction){
        super(producer, model, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("wciśnij przycisk");
    }
    @Override
    public void recharge() {
        System.out.println("Ladujem");
    }
    @Override
    public void rechargeFull() {
        System.out.println("Ladujem do pelna");
    }
    @Override
    public Double getBatteryLevel() { return 0.1; }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }

    public static final void defaultAPP(){
        String name = "Sklep";
        double version= 1.0;
        String branch ="stable";
        String server_url = "app//appshop.eu";
        String defaultProtocol = "app";
    }

    public void installAnApp(){
        String name = "YouTube";
        double version =3.11;
        String server_URL = "app//app_add.youtube.com";
    }
    public void installAnApp1(){
        String name = "Forum!";
        double version =0.11;
        String server_URL = "app//www.mitsumaniaki.com";
    }
    public void installAnApp2(){
        String name = "uniFi";
        double version =4.5;
        String server_URL = "app//unifi.com/download/mobile";
    }
    public void installAnApp3(){
        String name = "YouTube Vanced";
        double version =3.11;
        String server_URL = "app//vanced.you/mobile";
    }

}
