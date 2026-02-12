package mystudent;

public class Student {
    // Adding 'public' makes these available to App.java
    public String firstName;
    public String lastName;
    public double gpa;
    public String major;
    public int age;
    public boolean onProbation;

    // This method displays the student information
    public void sayHello() {
        System.out.println("Student: " + firstName + " " + lastName);
        System.out.println("Major: " + major + " | GPA: " + gpa);
    }
}
