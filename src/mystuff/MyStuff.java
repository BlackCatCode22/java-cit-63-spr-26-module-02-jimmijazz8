package mystuff;

 public class MyStuff {
    // Attributes: What our object has
    public String itemType = "TV";
    public String brand = "Samsung";
    public double price = 800.00;

    // Method: What our object can do
    public void describeItem() {
        System.out.println("Item: " + itemType);
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
    }
} 