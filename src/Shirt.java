public class Shirt {
  public int shirtID = 4;
  public String description = "Сорочка";

  public String colorCode = "Blue";
  public double price = 9999.9999;
  public int quantityInStock = 0;
  public String name = "Yvheniy";
  
  
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
    System.out.println("Quantity owner: " + name); 
  }
}
