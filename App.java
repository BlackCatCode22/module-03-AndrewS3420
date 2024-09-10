// AS 9/10/24
// App.java
// String point to create objects from my class
public class App {
    public static void main(String[] args) {


        System.out.println("\n\nWelome to classes and object- oriented programming\n");

        Student myNewStudent = new Student();

        myNewStudent.age = 66;
        myNewStudent.GPA = 3.4;
        myNewStudent.major = "History";
        myNewStudent.firstName = "Bob";
        myNewStudent.lastname = "Marley";
        myNewStudent.onProbation = true;

        // Output some stuff about our new object
        System.out.println("\n the first name of our student is: " + myNewStudent.firstName + "\n\n");

        // Create two more students
        Student anotherStudent = new Student();
        Student oneMoreStu = new Student();

         oneMoreStu.major = "history";

         anotherStudent.age = 25;

        // How many students
        System.out.println("\n there were " + Student.getNumOfStudents() + "students objects created");

        //Create a phone object
        Phone myNewPhone = new Phone();

        myNewPhone.model = "Iphone 15";
        myNewPhone.numOfCameras = 3;

        System.out.println("\n myNewPhone has " + myNewPhone.numOfCameras + " cameras\n");



    }
}
