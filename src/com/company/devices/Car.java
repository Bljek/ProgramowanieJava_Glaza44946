package com.company.devices;

public class Car extends Device {
    Double engineSize;
    Integer horsePower;
    String color;
    public Double price;

    public Car(String model, String producer, Integer year, String kolor, Integer liczbaKoni, Double price) {
        super(producer, year, model);
        this.color = kolor;
        this.horsePower = liczbaKoni;
        this.price = price;
    }
    public Object car(){
        Car car = new Car(this.model, this.producer, this.year, this.color, this.horsePower, this.price);
        return car;
    }
    public String toString(){
        return producer + " " + model + " " + color + " " + horsePower + " " + year + " " + price;
    }
    @Override public void turnOn() {
        System.out.println("Car is on");
    }
}