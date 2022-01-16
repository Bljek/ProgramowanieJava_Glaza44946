package com.company;
import java.time.LocalDateTime;

public class Human {
    public static Object getSalary;
    public static Double pensja;
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    Car car;

    private Double salary;
    private Double lastSalary;
    private Integer countOfGetting = 0;
    private LocalDateTime lastGet;

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Uwaga! Pensja nie może być niższa niż 0!");

        } else if (salary == null) {
            double a = 2600.00;
            this.salary = a;
            System.out.println("\nNowe dane zostały wysłane do systemu księgowego. \nNie zapomnij odebrać aneksu do umowy od Pani Hanny z działu kadr. \nZUS i US mają już informację o zmianie Twoich dochodów. Próby ukrycia ich nie mają sensu.");

        } else {
            double a = salary;
            a = salary;
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

}