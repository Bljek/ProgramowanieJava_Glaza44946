package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {
    public static void main(String[] args) {
        //Animal dog = new Animal("Dog");
        //dog.name = "Hacia";

        //System.out.println("Hi, I'm " + dog.name);

        //dog.feed();

        //me.pet.feed();
        //System.out.println(me.pet.species);

        //me.pet = new Animal("Lion");
        // me.pet.name = "Myszoskoczek";

        //me.pet.feed();

        //System.out.println(me.pet.species);

        //Animal cat = new Animal("cat");
        //cat.feed();

        //for (int i = 0; i < 52; i++)
        //{
        //   cat.takeForAWalk();
        //}

        Car brak = new Car("brak","brak",0,"brak",0,0.0);
        Car astra = new Car("Astra","Opel",2003,"zielony",85,2500.00);
        Car ceed = new Car("Ceed","Kia",2010,"czerwony",110,8900.00);
        Car vitara = new Car("Vitara","Suzuki",2018,"srebrny",210,48000.00);
        Car model3 = new Car("Model 3","Tesla",2020,"niebieski",450, 110000.00);
        Car astra1 = new Car("Astra","Opel",2003,"zielony",85,2500.00);

        System.out.println("Wypisz astre: " + astra);
        System.out.println("Wypisz Ceed: " + ceed);
        System.out.println("Wypisz też drugą astre: " + astra1 + "\n");
        //me.car = car;

        //me.setSalary(2600.0);
        //System.out.println(me.getSalary());
        //me.setSalary(-3000.0);
        //System.out.println(me.getSalary());
        //me.setCar(brak);
        //me.setCar(model3);
        //System.out.println("Mój samochód: " + me.getCar().producent + " " + me.getCar().model + " z roku " + me.getCar().year + " i kosztował mnie " + me.getCar().price);
        //me.setCar(vitara);
        //System.out.println("Mój samochód: " + me.getCar().producent + " " + me.getCar().model + " z roku " + me.getCar().year + " i kosztował mnie " + me.getCar().price);
        //me.setCar(ceed);
        //System.out.println("Mój samochód: " + me.getCar().producent + " " + me.getCar().model + " z roku " + me.getCar().year + " i kosztował mnie " + me.getCar().price);
        //me.setCar(astra);
        //System.out.println("Mój samochód: " + me.getCar().producent + " " + me.getCar().model + " z roku " + me.getCar().year + " i kosztował mnie " + me.getCar().price);

        System.out.println("Porównanie Astry i Astry1: " + astra.equals(astra1));
        System.out.println("Porównanie Astry i Astry: " + astra.equals(astra) + "\n");

        Animal ragnar = new Animal("Dog", "Ragnar", 500.00);
        Animal ora = new Animal("Dog", "Ora", 150.00);
        Phone op6 = new Phone ("OnePlus", "6", 1500.00, 6.5, "Snapdragon 865", 2018);
        Phone op7p = new Phone("OnePlus","7 Pro",2999.99, 6.7, "Snapdragon 875",2019);
        Human me = new Human("Karol","Glaza", 0.0, op7p, ragnar, ceed);
        Human wife = new Human("Alicja", "Glaza", 25000.00, op6, ora, null);

        System.out.println("Zwierze: " + ragnar + "\n" + "Telefon: " + op7p + "\n" + "Samochód: " + ceed + "\n" + "Ja: " + me);

    }
}