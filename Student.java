public class Student {
    private static int numOfStudents = 0;

    // Create a constructor for our new objects
    public Student() {
        numOfStudents++;
    }

    public static int getNumOfStudents(){
        return numOfStudents;
    }

    // Give our student a few fields
    String firstName;
    String lastname;
    String major;
    double GPA;
    int age;
    boolean onProbation;
