package mystudent;

public class App {
    public static void main(String[] args) {
        // Create the student object using your blueprint
        Student myStudent = new Student();

        // Assign your actual data to the object
        myStudent.firstName = "Jagjit";
        myStudent.lastName = "Kaur";
        myStudent.major = "CIT";
        myStudent.gpa = 4.0;
        myStudent.age = 20;
        myStudent.onProbation = false;

        // Tell the student to run the sayHello action
        myStudent.sayHello();
    }
}

