package com.example.animals.mammals;

import com.example.animals.Animal;

/**
 * Klasa reprezentująca psa, dziedzicząca po klasie Animal.
 */
public class Dog extends Animal {
    private String breed;

    /**
     * Konstruktor klasy Dog.
     * @param name imię psa
     * @param age wiek psa
     * @param breed rasa psa
     */
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    /**
     * Metoda do apportowania.
     */
    public void fetch() {
        System.out.println("Fetching the ball!");
    }
}