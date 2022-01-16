package com.company;
public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("Dog");
        dog.name = "Hacia";

        //System.out.println("Hi, I'm " + dog.name);

        //dog.feed();

        Human me = new Human();
        me.firstName = "Karol";
        me.lastName = "Glaza";
        me.pet = dog;
        me.setSalary(2600.00);

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
        //me.car = car;

        //me.setSalary(2600.0);
        //System.out.println(me.getSalary());
        //me.setSalary(-3000.0);
        //System.out.println(me.getSalary());
        me.setCar(brak);
        me.setCar(model3);
        System.out.println("Mój samochód: " + me.getCar().producent + " " + me.getCar().model + " z roku " + me.getCar().year + " i kosztował mnie " + me.getCar().price);
        me.setCar(vitara);
        System.out.println("Mój samochód: " + me.getCar().producent + " " + me.getCar().model + " z roku " + me.getCar().year + " i kosztował mnie " + me.getCar().price);
        me.setCar(ceed);
        System.out.println("Mój samochód: " + me.getCar().producent + " " + me.getCar().model + " z roku " + me.getCar().year + " i kosztował mnie " + me.getCar().price);
        me.setCar(astra);
        System.out.println("Mój samochód: " + me.getCar().producent + " " + me.getCar().model + " z roku " + me.getCar().year + " i kosztował mnie " + me.getCar().price);


    }
}