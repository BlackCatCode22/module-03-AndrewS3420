// AS 9/19/24
// Main.java
// Driver file for Animal and Hyena class usage

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.printf("\n Welcome to my Zoo Program");

        // Open the arriving animal file
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\BE218\\JavaStuff\\arrivingAnimals.txt"));
            String myLine;

            // Read the file one line at a time
            while ((myLine = bufferedReader.readLine()) != null) {
                System.out.println(myLine);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Create an Animal object.
        Animal myAnimalObject = new Animal();


        myAnimalObject.setAge(4);

        // Use our new Animal object.
        System.out.println("\n My animal's age is: " + myAnimalObject.getAge());

        // Create a Hyena object
        Hyena myNewHyena = new Hyena();

        myNewHyena.setAge(7);

        // Output the age of our Hyena
        System.out.println("\n The age of our hyena is; " + myNewHyena.getAge() + " years old");

        // Create a Lion object
        Lion myLion = new Lion();

        // make the Lion 12 years old
        myLion.setAge(12);

        // Output our Lion's age
        System.out.println("\n Our lion is " + myLion.getAge() + " years old");

        // Output the number of animals.
        System.out.println("\n The number of animals created is: " + Animal.numOfAnimals);
    }
}


