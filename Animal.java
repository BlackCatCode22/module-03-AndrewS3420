package myanimals;

public class Animal {
    // There is not a "static" keyword here, so... this method
    // will be available tp Animal object
    // Create a static nmember named numOfAnimals
    public static int numOfAnimals = 0;

    // Create a constructor
    public Animal() {
        numOfAnimals++;
    }


    public void animalSound() {
        System.out.println("\n A sound from the animal class. ");
    }
}
