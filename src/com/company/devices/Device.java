package com.company.devices;

public abstract class Device {
    String producer;
    Integer year;
    String model;

    public Device(String producer, Integer year, String model) {
        this.producer = producer;
        this.year = year;
        this.model = model;
    }

    abstract public void turnOn();

}

