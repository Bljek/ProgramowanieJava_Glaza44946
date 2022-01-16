package com.company;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.time.LocalDateTime;

public class Human {
    public static Object getSalary;
    public Double pensja;
    public Double cash;
    public String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    Car car;
    Human seller;
    Human buyer;

    private Double salary;
    private Double lastSalary;
    private Integer countOfGetting = 0;
    private LocalDateTime lastGet;

    public Human(String firstName, String lastName, Double Cash, Phone phone, Animal pet, Car car){
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
        this.phone = phone;
        this.pet = pet;
        this.car = car;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Uwaga! Pensja nie może być niższa niż 0!");

        } else if (salary == null) {
            this.salary = 2600.00;
            System.out.println("\nNowe dane zostały wysłane do systemu księgowego. \nNie zapomnij odebrać aneksu do umowy od Pani Hanny z działu kadr. \nZUS i US mają już informację o zmianie Twoich dochodów. Próby ukrycia ich nie mają sensu.");

        } else {
            double a = salary;
            a = a * 100;
            a = Math.floor(a);
            a = a / 100;
            this.salary = a;
            System.out.println("\nNowe dane zostały wysłane do systemu księgowego. \nNie zapomnij odebrać aneksu do umowy od Pani Hanny z działu kadr. \nZUS i US mają już informację o zmianie Twoich dochodów. Próby ukrycia ich nie mają sensu.");
        }
    }
    public Double getSalary() {
        if (countOfGetting == 0) {
            countOfGetting++;
            lastSalary = this.salary;
            lastGet = LocalDateTime.now();
            System.out.println("\nLiczba wglądów w Twoją pensję: " + countOfGetting + "\nCzas ostatniego wglądu: " + lastGet + "\nTwoja pensja wtedy: " + lastSalary + "\n\nTwoja pensja wynosi:");
            return this.salary;
        }
        else {
            countOfGetting++;
            System.out.println("\nLiczba wglądów w Twoją pensję: " + countOfGetting + "\nCzas ostatniego wglądu: " + lastGet + "\nTwoja pensja wtedy: " + lastSalary + "\n\nTwoja pensja wynosi:");
            lastSalary = this.salary;
            lastGet = LocalDateTime.now();
            return this.salary;
        }

    }

    public Car getCar() {
        return (Car) car.car();
    }

    public void buyACar(Car car){
        if (this.salary > car.price){
            System.out.println("Twoje nowe auto czeka na odbiór!");
            this.car = (Car) car.car();
        } else if (salary > (car.price/12)) {
            System.out.println("Właśnie zostałeś posiadaczem nowego auta! I kredytu...");
            this.car = (Car) car.car();
        } else {
            System.out.println("Zacytuje klasyka: 'Biedaku, nawet złota nie masz'");
        }
    }
    public void setCar(Car car){
            this.car = (Car) car.car();
        }
        public Animal getPet(){
        return (Animal) pet.animal();
        }
    public void setPet(Animal animal) {
        this.pet = (Animal) pet.animal();
    }
    public Phone getPhone(){
        return (Phone) phone.phone();
    }
    public void setPhone(Phone phone) {
        this.phone = (Phone) phone.phone();
    }
    public String toString(){
        return firstName + " " + lastName + " " + phone + " " + pet + " " + car;
    }
}