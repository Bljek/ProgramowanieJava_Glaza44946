package com.company;

public class Car {
    Double engineSize;
    Integer horsePower;
    String color;
    final String model;
    final String producent;
    Integer year;
    Double price;

    public Car(String model, String producent, Integer year, String kolor, Integer liczbaKoni, Double price) {
        this.model = model;
        this.producent = producent;
        this.color = kolor;
        this.horsePower = liczbaKoni;
        this.year = year;
        this.price = price;
    }
    public Object car(){
        Car car = new Car(this.model, this.producent, this.year, this.color, this.horsePower, this.price);
        return car;
    }
}