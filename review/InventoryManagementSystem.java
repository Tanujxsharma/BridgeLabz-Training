import java.util.*;

class Product {
    int productId;
    String name;
    int stock;

    public Product(int productId, String name, int stock) {
        this.productId = productId;
        this.name = name;
        this.stock = stock;
    }

    public void updateStock(int quantity) {
        this.stock += quantity;
    }

    @Override
    public String toString() {
        return "ProductID: " + productId +  " Name: " + name + " Stock: " + stock;
    }
}


interface AlertService {
    void sendLowStockAlert(Product product);
}

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

class Inventory implements AlertService {

    private HashMap<Integer, Product> products = new HashMap<>();

    private PriorityQueue<Product> lowStockQueue = new PriorityQueue<>(Comparator.comparingInt( product -> product.stock ));

    public void addProduct(Product product) {
        products.put(product.productId, product);
        checkLowStock(product);
    }

    public void updateProductStock(int productId, int quantity) throws OutOfStockException {

        Product product = products.get(productId);

        if (product.stock + quantity < 0) {
            throw new OutOfStockException(" Product out of stock ");
        }

        product.updateStock(quantity);
        checkLowStock(product);
    }

    public void checkLowStock(Product product) {
        if (product.stock <= 5) {
            lowStockQueue.offer(product);
            sendLowStockAlert(product);
        }
    }

    public void displayLowStockProducts() {
        System.out.println(" Low Stock Products:");
        PriorityQueue<Product> temp = new PriorityQueue<>(lowStockQueue);

        while (!temp.isEmpty()) {
            System.out.println(temp.poll());
        }
    }
    @Override
    public void sendLowStockAlert(Product product) {
        System.out.println("  Low stock for " +  product.name + " remaning stock is  " + product.stock );
    }
    public void displayAllProduct() {
    	System.out.println("All products are");
    		System.out.println(products);
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        try {
            inventory.addProduct(new Product(101, "Laptop", 10));
            inventory.addProduct(new Product(102, "Mouse", 4));
            inventory.addProduct(new Product(103, "Keyboard", 2));

            inventory.updateProductStock(101, -6);
            inventory.updateProductStock(102, -2);

            inventory.displayLowStockProducts();
            inventory.displayAllProduct();

        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }
    }
}
