package com.company.devices;

import com.company.Human;

public class Car extends Device  {
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
        System.out.println("Your car is on");
    }

    public void sell(Human buyer, Human seller, Double price) throws  Exception {
            if (buyer.cash < price) {
                throw new Exception("Get more cash");
            } else if (seller.getCar() != this) {
                throw new Exception("You can't sell this " + this.model + ". It's doesn't belong to you");
        } else {
                buyer.cash = buyer.cash - price;
                seller.cash = seller.cash + price;
                buyer.setCar(this);
                seller.setCar(null);
                System.out.println(seller.firstName + " just sold " + this.model + " to "+ buyer.firstName + " for " + this.price);
            }
    }
}