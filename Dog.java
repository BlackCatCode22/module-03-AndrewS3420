public class Dog {
    // Create two fields for our Dog objects

    private String name;
    private int age;

    // Create getters and setters for our fields.
    public void setName(String name){
        this.name = name;
    }
     public  String getName() {
        return name;
     }

     // Create getter and setter for age.
    public int getAge(){
        return this.age;
        // this would work as well because there is no ambiguity
        // return age;

    }
    public void setAge(int i){

    }

    // Create a constructor for the Dog obejct that will be ceated with the "new" keyword
    // a constructor is a speical method that is called or invokes when... the Dog class is used
    // to create am object
    public Dog() {
        System.out.println("\n A dog object was created!! This message if from the constructor\n");
    }
    // Create a constructor that accepts a String data type for the Dog's name.
    public Dog(String myName) {
        this.name = myName;

    }

    // Create a constructor that accepts an argument when an object is created, this argument will
    // be an int
    public Dog(int theAge){
        this.age = theAge;

    }

    // Create a constructor that accepts two arguments - a String for the name, and an int for age.
    public Dog(String someName, int someAge ){
        // Assign name and age to our new object.
        this.age = someAge;
        this.name = someName;


    }
}
