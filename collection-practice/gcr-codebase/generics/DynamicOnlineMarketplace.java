import java.util.*;
// Marker interface for categories
interface Category {
    String getCategoryName();
}
// Categories
class BookCategory implements Category {
    public String getCategoryName() {
        return "Books";
    }
}

class ClothingCategory implements Category {
    public String getCategoryName() {
        return "Clothing";
    }
}

class GadgetCategory implements Category {
    public String getCategoryName() {
        return "Gadgets";
    }
}

// Generic Product class with bounded type parameter
class Product<T extends Category> {
    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void display() {
        System.out.println(
            "Product: " + name +
            ", Category: " + category.getCategoryName() +
            ", Price: " + price
        );
    }
}

// Marketplace utility class
class Marketplace {

     // Generic method with bounded type
	public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
		
        product.price = product.price - (product.price * percentage / 100);
    }
}

public class DynamicOnlineMarketplace {

    public static void main(String[] args) {

        Product<BookCategory> book = new Product<>("Java Programming", 500, new BookCategory());

        Product<ClothingCategory> shirt =new Product<>("T-Shirt", 1200, new ClothingCategory());

        Product<GadgetCategory> phone =new Product<>("Smartphone", 15000, new GadgetCategory());

        List<Product<?>> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        System.out.println("Before Discount:");
        for (Product<?> product : catalog) {
            product.display();
        }

        Marketplace.applyDiscount(book, 10);
        Marketplace.applyDiscount(shirt, 20);
        Marketplace.applyDiscount(phone, 5);

        System.out.println("\nAfter Discount:");
        for (Product<?> product : catalog) {
            product.display();
        }
    }
}
