package com.company.devices;

public class Phone extends Device{
    Double price;
    Double screenSize;
    String processor;

    public Phone(String producer, String model, Double price, Double screenSize, String processor, Integer year){
        super(producer, year, model);
        this.price = price;
        this.screenSize = screenSize;
        this.processor = processor;
    }

    public String toString(){
        return producer + " " + model + ", price: " + price + ", screen size: " + screenSize + "', processor: " + processor + ", year: " + year;

    }
    @Override public void turnOn() {
        System.out.println("Your phone is on");

    }
}