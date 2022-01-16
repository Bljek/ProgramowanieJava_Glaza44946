package com.company.devices;

import com.company.Animal;
import com.company.Human;

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

    public Object phone() {
        Phone phone = new Phone(this.producer,this.model,this.price,this.screenSize,this.processor,this.year);
        return phone;
    }
    public void sell(Human buyer, Human seller, Double price) throws  Exception {
        if (buyer.cash < price) {
            throw new Exception("Get more cash");
        } else if (seller.getPhone() != this) {
            throw new Exception("You can't sell this " + this.model + ". It's doesn't belong to you");
        } else {
            buyer.cash = buyer.cash - price;
            seller.cash = seller.cash + price;
            buyer.setPhone(this);
            seller.setPhone(null);
            System.out.println(seller.firstName + " just sold " + this.model + " to "+ buyer.firstName + " for " + this.price);
        }
    }

}