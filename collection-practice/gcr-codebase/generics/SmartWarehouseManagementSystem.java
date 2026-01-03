import java.util.*;

// Base abstract class
abstract class WarehouseItem {
    String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Item types
class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }
}

class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }
}

class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }
}

// Generic storage class with bounded type
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

public class SmartWarehouseManagementSystem {

    // Wildcard method
       static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getName());
        }
    }

      public static void main(String[] args) {

         Storage<Electronics> electronicsStorage = new Storage<>();
         electronicsStorage.addItem(new Electronics("Laptop"));
         electronicsStorage.addItem(new Electronics("Mobile"));

         Storage<Groceries> groceriesStorage = new Storage<>();
         groceriesStorage.addItem(new Groceries("Rice"));
         groceriesStorage.addItem(new Groceries("Milk"));

         Storage<Furniture> furnitureStorage = new Storage<>();
          furnitureStorage.addItem(new Furniture("Table"));
         furnitureStorage.addItem(new Furniture("Chair"));

         System.out.println("Electronics Items:");
          displayItems(electronicsStorage.getItems());

         System.out.println("\nGroceries Items:");
          displayItems(groceriesStorage.getItems());
  
          System.out.println("\nFurniture Items:");
         displayItems(furnitureStorage.getItems());
    }
}
