package myanimals;

/**
 * Cat is a subclass of Animal.
 * It inherits 'name' and the 'numOfAnimals' counter from the Animal class.
 */
public class Cat extends Animal {
    
    // This is a unique behavior just for Cats
    public void meow() {
        System.out.println(name + " says: Meow!");
    }
}
