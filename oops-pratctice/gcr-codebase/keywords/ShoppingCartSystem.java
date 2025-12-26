public class ShoppingCartSystem {
	// declaring variables 
	private static double discount;
	private final String  productId;
	private String productName;
	private double prize;
	private int quantity;
	
	// constructor
	public ShoppingCartSystem(String productId,String productName,double prize,int quantity) {
		this.productId=productId;
		this.productName=productName;
		this.prize=prize;
		this.quantity=quantity;
	}
	// method to update discount price 
	public static void updateDiscount(double newDiscount) {
		if(newDiscount>=0.0 && newDiscount <=100.0) {
			discount+=newDiscount;
		}
		else {
			System.out.print("enter the correct discount ");
		}
	}
	// method to get discounted price for the product 
	   public double getDiscountedPrice() {
	       return prize - (prize * discount / 100);
	   }

	  public void displayProductDetails() {
	       // Using 'instanceof' to verify the object's type before displaying details
	       if (this instanceof ShoppingCartSystem) {
	           System.out.println("Product ID: " + productId);
	           System.out.println("Product Name: " + productName);
	           System.out.println("Price: " + prize);
	           System.out.println("Quantity: " + quantity);
	           System.out.println("Discount: " + discount + "%");
	           System.out.println("Price after Discount: " + getDiscountedPrice());
	       } else {
	           System.out.println("The object is not an instance of the Product class.");
	       }
	   }

	public static void main(String[] args) {
		
	}

}
