package com.company;

import com.company.devices.Car;
import com.company.creatures.Human;
import com.company.creatures.Animal;
import com.company.devices.Phone;

public class Main extends Animal {

    public Main(String spieces) {
        super(spieces);
    }

    public static void main(String[] args) {
	Animal dog = new Main("canis");
	dog.feed();
	dog.feed();
	dog.takeForAWalk();
	dog.takeForAWalk();
	dog.takeForAWalk();
	dog.takeForAWalk();

	System.out.println(dog.getWeight());

	Human me = new Human("");
    Car passat1 = new Car("VW", "passat", 1992) {
        @Override
        public void refuel() {

        }
    };
    passat1.millage = 80000.0;
    Car passat2 = new Car("VW", "passat", 2005) {
        @Override
        public void refuel() {

        }
    };
    passat2.millage = 80000.0;

    System.out.println(passat1 == passat2);
    System.out.println(passat1.equals(passat2));


        me.setPesel("65408096");

    System.out.println(me.getPesel());

    String text = me.getPesel();


    }
}
