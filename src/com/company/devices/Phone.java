package com.company.devices;

public class Phone {
    String producer;
    String model;
    Double price;
    Double screenSize;
    String processor;

    public Phone(String producer, String model, Double price, Double screenSize, String processor){
        this.producer = producer;
        this.model  = model;
        this.price = price;
        this.screenSize = screenSize;
        this.processor = processor;
    }

    public String toString(){
        return producer + " " + model + " " + price + " " + screenSize + " " + processor;

    }
}