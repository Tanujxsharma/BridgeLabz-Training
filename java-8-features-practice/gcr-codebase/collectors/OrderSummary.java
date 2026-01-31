import java.util.*;
import java.util.stream.Collectors;

class Order {
    String customer;
    double amount;

    Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }
}

public class OrderSummary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Order> orders = Arrays.asList(
                new Order("Amit", 2500.50),
                new Order("Sumit", 1800.00),
                new Order("Amit", 3200.00),
                new Order("Pankaj", 1500.75),
                new Order("Sumit", 2200.25),
                new Order("Amit", 2500.50),
                new Order("Sumit", 1800.00),
                new Order("Amit", 3200.00),
                new Order("Pankaj", 1500.75),
                new Order("Sumit", 2200.25)
        );
		
		Map<String, Double> summary = orders.stream().collect(
				Collectors.groupingBy(order -> order.customer,Collectors.summingDouble(order -> order.amount)));
		
		summary.forEach((man,bill)-> System.out.println(man +" :"+bill));
		
	}

}