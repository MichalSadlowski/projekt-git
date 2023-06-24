package com.example.test;

import com.example.animals.Animal;
import com.example.animals.mammals.Dog;
import com.example.animals.birds.Parrot;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Klasa główna służąca do testowania funkcjonalności klas związanych z zwierzętami.
 */
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Animal dog = new Dog("Buddy", 5, "Labrador");
        dog.displayInfo();
        dog.makeSound();

        Animal parrot = new Parrot("Polly", 3, "Green");
        parrot.displayInfo();
        parrot.makeSound();

        Dog dog2 = (Dog) dog;
        dog2.fetch();

        Parrot parrot2 = (Parrot) parrot;
        parrot2.mimicHumanSpeech();

        logger.info("Program executed successfully.");
    }
}