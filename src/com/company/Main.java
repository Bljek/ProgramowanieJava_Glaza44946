package com.company;
public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("Dog");
        dog.name = "Hacia";
        System.out.println("Hi, I'm " + dog.name);
        dog.feed();
        Human me = new Human();
        me.firstName = "Karol";
        me.lastName = "Glaza";
        me.pet = dog;
        me.pet.feed();
        System.out.println(me.pet.species);
        me.pet = new Animal("Lion");
        me.pet.name = "Myszoskoczek";
        me.pet.feed();
        System.out.println(me.pet.species);
        Animal cat = new Animal("cat");
        cat.feed();
        Car car = new Car("Astra", "Opel");
        car.engineSize = 1.5;
        car.liczbaKoni = 138;
        car.kolor = "zielony";

        me.car = car;


    }
}