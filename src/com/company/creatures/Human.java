package com.company.creatures;

import java.util.ArrayList;
import java.util.Date;
import com.company.devices.Phone;
import com.company.devices.Car;


public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    private Double salary = 3200.0;
    private String pesel;
    public Car car;
    public double cash;
    public int garageSize =2;
    public ArrayList<Car> Garage;
    public Human(String spieces) {
        super(spieces);
        Garage = new ArrayList<>();
    }

    public Car getCar(int parkingSpace){

        if(Garage.get(parkingSpace)== null){


            System.out.println("No car found");
        } else {
            System.out.println(Garage.get(parkingSpace).producer);
            System.out.println(Garage.get(parkingSpace).model);
            System.out.println(Garage.get(parkingSpace).yearOfProduction);
            System.out.println(Garage.get(parkingSpace).color);
            System.out.println(Garage.get(parkingSpace).millage);
            System.out.println(Garage.get(parkingSpace).engineVolume);
            System.out.println(Garage.get(parkingSpace).value);
        }
        return this.Garage.get(parkingSpace);
    }

    public void setCar(Car car, boolean usun){

        if(usun) {
            for (int i = 0; i < garageSize; i++) {
                if (car == Garage.get(i)){
                    Garage.set(i, null);
                }
            }
        }
        else if(Garage.size() <garageSize){
            Garage.add(car);
        }
        else{
            System.out.println("Brak miejsca brachu");
        }

    }


    public Double getSalary() {
        System.out.println(new Date());
        System.out.println(("wartość wypłaty: " + this.salary));
        return salary;
    }

    public void setSalary(Double salary) {
        if(salary > 0) {
            System.out.println("Nowe dane zostały wysłane do księgowego");
            System.out.println("Koniecznie odbierz aneks do umowy od pani Hani");
            System.out.println("ZUS i US wie już wie o zmianie wypłaty więc nie ukrywaj dochodów mordo");
            this.salary = salary;
        }
    }


    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
       if(this.salary > car.value) {
           System.out.println("Udało kupić się samochód za gotówkę");
           this.car = car;
       } else if (this.salary > car.value/12) {
           System.out.println("Udało się kupić samochód ale na kredyt chlipchlip smuteczek");
           this.car = car;
       } else {
           System.out.println("nie udało ci się kupić samochodu chlipchlip smuteczek a teraz do roboty");
       }

    }

    public void checkGarageValue(){
        float value = 0;
        for(int i =0; i < garageSize;i++){
            value += Garage.get(i).value;
        }
        System.out.println("wartość aut w garażu: "+ value);
    }

    @Override
    public void feed() {

    }

}
