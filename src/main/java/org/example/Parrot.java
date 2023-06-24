package com.example.animals.birds;

import com.example.animals.Animal;

/**
 * Klasa reprezentująca papugę, dziedzicząca po klasie Animal.
 */
public class Parrot extends Animal {
    private String color;

    /**
     * Konstruktor klasy Parrot.
     * @param name imię papugi
     * @param age wiek papugi
     * @param color kolor papugi
     */
    public Parrot(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Squawk!");
    }

    /**
     * Metoda do naśladowania mowy człowieka.
     */
    public void mimicHumanSpeech() {
        System.out.println("Mimicking human speech!");
    }
}