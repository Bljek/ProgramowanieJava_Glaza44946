package com.company;

import java.io.File;

public class Animal {
    String species;
    String name;
    Double weight;
    File pic;

    void feed(){
        weight++;
        System.out.println("Thx, me weight is now " + weight);

    }


}