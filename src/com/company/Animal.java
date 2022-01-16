package com.company;
import java.io.File;
import java.math.BigDecimal;
public class Animal {
    final String species;
    String name;
    File pic;
    private Double weight;
    private Boolean isDead = false;
    static final Double DEFAULT_DOG_WEIGHT = 10.0;
    static final Double DEFAULT_LION_WEIGHT = 30.0;
    static final Double DEFAULT_OTHER_WEIGHT = 5.0;

    public Animal(String species, String name) {
        this.species = species;
        this.name = name;
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
    void die() {
        System.out.println("Your pet died!");
        this.isDead = true;
    }
    public String toString() {
        return species + " " + name;
    }
}