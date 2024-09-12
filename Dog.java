package myanimals;

public class Dog extends Animal{
    // The Dog class is a subclass of Animal
    // so it should have all the methods from the Animal class
    // available to it.
    // This is polymorphism - this word means "many shapes"
    // when used here, by a Dog object, this method that has the same name
    // as the method in the superclass, take another shape.
    public void animalSound() {
        System.out.println("\n A sound from the Dog class use by a Dog object - 'bark'");
    }

}

