package com.company;

public class Car {
    Double engineSize;
    Integer liczbaKoni;
    String kolor;
    final String model;
    final String producent;

    public Car(String model, String producent) {
        this.model = model;
        this.producent = producent;
    }
}