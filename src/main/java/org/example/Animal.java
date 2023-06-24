package com.example.animals;

/**
 * Klasa abstrakcyjna reprezentująca zwierzę.
 */
public abstract class Animal {
    protected String name;
    protected int age;

    /**
     * Konstruktor klasy Animal.
     * @param name imię zwierzęcia
     * @param age wiek zwierzęcia
     */
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Abstrakcyjna metoda do wydawania dźwięku przez zwierzę.
     */
    public abstract void makeSound();

    /**
     * Metoda do wyświetlania informacji o zwierzęciu.
     */
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
