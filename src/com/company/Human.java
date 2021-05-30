package com.company;

import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;
    private Double salary = 3200.0;
    private String pesel;


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
}
