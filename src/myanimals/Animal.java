package myanimals;

public class Animal {
    // This variable is shared by all animals (Static)
    public static int numOfAnimals = 0;
    public String name;

    // This runs every time a new Cat or Dog is created
    public Animal() {
        numOfAnimals++; 
        System.out.println("A new animal was created! Total count is now: " + numOfAnimals);
    }
}