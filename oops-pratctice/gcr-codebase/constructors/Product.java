public class Product {
	String productName;
	int prize;
	static int totalProduct;
	Product(String productName,int prize){
		this.productName=productName;
		this.prize=prize;
		totalProduct++;
	}
	public void displayProductDetails() {
		System.out.print("the name of the product is "+this.productName+"and the prize is "+this.prize);
	}
	public static void displayTotalProducts() {
		System.out.println(totalProduct);
	}
	public static void main(String[] args) {
		 Product product1 = new Product("Laptop", 1200);
	        product1.displayProductDetails();
	        Product.displayTotalProducts();

	        System.out.println();

	        Product product2 = new Product("Mouse", 25);
	        product2.displayProductDetails();
	        Product.displayTotalProducts();

	        System.out.println();

	        Product product3 = new Product("Keyboard", 75);
	        product3.displayProductDetails();
	        Product.displayTotalProducts();
	}

}
