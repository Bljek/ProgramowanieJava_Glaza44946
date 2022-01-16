package com.company;
import java.io.File;
import java.math.BigDecimal;
public class Animal {
    final String species;
    String name;
    File pic;
    private Double weight;
    private Boolean isDead = false;
    Double price;
    static final Double DEFAULT_DOG_WEIGHT = 10.0;
    static final Double DEFAULT_LION_WEIGHT = 30.0;
    static final Double DEFAULT_OTHER_WEIGHT = 5.0;

    public Animal(String species, String name, Double price) {
        this.species = species;
        this.name = name;
        this.price = price;
        if (species.equals("Dog")) {
            weight = DEFAULT_DOG_WEIGHT;
        } else if (species.equals("Lion")) {
            weight = DEFAULT_LION_WEIGHT;
        } else {
            weight = DEFAULT_OTHER_WEIGHT;
        }
    }

    void feed() {
        if (this.isDead) {
            System.out.println("Your peat is dead, you can't feed it!");
        } else {
            weight += 0.1;
            System.out.println("Thx bro, my weight is now " + weight);
        }
    }

    void takeForAWalk() {
        if (this.isDead) {
            System.out.println("Your pet is dead, you can't walk with him.");
            return;
        } else {
            weight -= 0.1;
            System.out.println("You took your pet for a walk, it's weight now is " + weight);
        }
        if (weight <= 0) {
            this.die();
        }
    }
    public Object animal(){
        Animal animal = new Animal(this.name, this.species, this.price);
        return animal;
    }

    void die() {
        System.out.println("Your pet died!");
        this.isDead = true;
    }

    public String toString() {
        return species + " " + name;
    }

    public void sell(Human buyer, Human seller, Double price) throws  Exception {
        if (buyer.cash < price) {
            throw new Exception("Get more cash");
        } else if (this.species == "human") {
            throw new Exception("You can't sell this! It's a human being");
        } else {
            buyer.cash = buyer.cash - price;
            seller.cash = seller.cash + price;
            buyer.setPet(this);
            seller.setPet(null);
            System.out.println(seller.firstName + " just sold " + this.name + " to " + buyer.firstName + " for " + this.price);
        }

    }
}