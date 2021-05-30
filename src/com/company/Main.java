package com.company;


public class Main {

    public static void main(String[] args) {
	Animal dog = new Animal("jamnik");
	dog.feed();
	dog.feed();
	dog.takeForAWalk();
	dog.takeForAWalk();
	dog.takeForAWalk();
	dog.takeForAWalk();

	System.out.println(dog.getWeight());

	Human me = new Human();
    Car passat = new Car("VW", "passat");
    me.car = passat;

        me.setPesel("65408096");

    System.out.println(me.getPesel());

    String text = me.getPesel();

    }
}
