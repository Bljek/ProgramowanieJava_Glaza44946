
package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal();

        dog.name="Haiko";

        System.out.println("I am "+dog.name);

        dog.feed();
        dog.feed();
        dog.feed();


        Human me = new Human();
        me.firstName="Karol";
        me.lastName="Glaza";
        me.pet = dog;
    }
}