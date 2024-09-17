//AS 9/17/24
public class MainClassPractice {
    public static void main(String[] args) {

        System.out.println("\n Welcome to my DOG Class Practice\n");

        // Create a couple of dog objects
        // with an empty argument ("no args")
        Dog myDog = new Dog();
        Dog another = new Dog();

        // Create a dog with a String name
        Dog aDog = new Dog("spot");

        // Output the new Dog object's name
        System.out.println("\n the new dog's name is: " + aDog.getName());

        // Create a fourth dog with an int age
        Dog fourthDog = new Dog(33);

        // Output the dog's age.
        System.out.println("\n my new dog's age is; " + fourthDog.getAge());

        // And... finally create a fifth and last dog...
        Dog fifthDog = new Dog("my new dog's name", 7);

        // Validate it
        System.out.println(" my dog who is name; " + fifthDog.getName() + " had a birthday and age is now: " + fifthDog.getAge());

        // Give our dog a birthday (add year to its age
        fifthDog.setAge(fifthDog.getAge() + 1);

    }
}