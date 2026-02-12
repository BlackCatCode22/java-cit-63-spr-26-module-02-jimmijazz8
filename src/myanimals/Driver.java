package myanimals; // Ensure this says myanimals, NOT mycards

public class Driver {
    public static void main(String[] args) {
        
        // This triggers the Animal constructor
        Dog myDog = new Dog();
        myDog.name = "Jimmi";
        myDog.bark();

        Cat myCat = new Cat();
        myCat.name = "Jazz";
        myCat.meow();

        // Accessing the static variable
        System.out.println("Total animals created: " + Animal.numOfAnimals);
    }
}