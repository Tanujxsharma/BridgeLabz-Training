import java.util.*;
class TheCoffeeCounterChronicles{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isTrue = true;
        while(isTrue){ // Loop for continuous ordering
            System.out.println("Enter your order as 1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha, 5 to Exit:");
            System.out.println("1. Espresso - 350 + GST ");
            System.out.println("2. Latte - 100 + GST ");
            System.out.println("3. Cappuccino - 200 + GST ");
            System.out.println("4. Mocha - 400 + GST ");
            System.out.println("5. Exit Ordering");
            int order = sc.nextInt();
            System.out.println("Enter number of coffee you want :");
            int quantity =sc.nextInt();
            switch(order) { // Switch case for different coffee orders
                case 1 -> {// Espresso case
                    double espressoPrice = 350 * quantity;
                    double espressoGST = espressoPrice * 0.18;
                    double espressoTotal = espressoPrice + espressoGST;
                    System.out.println("Total price for Espresso: " + espressoTotal);
                }
                case 2 -> {// 
                    double lattePrice = 100 * quantity;
                    double latteGST = lattePrice * 0.18;
                    double latteTotal = lattePrice + latteGST;
                    System.out.println("Total price for Latte: " + latteTotal);
                }
                case 3 -> {// Cappuccino case
                    double cappuccinoPrice = 200 * quantity;
                    double cappuccinoGST = cappuccinoPrice * 0.18;
                    double cappuccinoTotal = cappuccinoPrice + cappuccinoGST;
                    System.out.println("Total price for Cappuccino: " + cappuccinoTotal);
                }
                case 4 -> { // Mocha case
                    double mochaPrice = 400 * quantity;
                    double mochaGST = mochaPrice * 0.18;
                    double mochaTotal = mochaPrice + mochaGST;
                    System.out.println("Total price for Mocha: " + mochaTotal);
                }
                case 5 -> { // Exit option
                    isTrue = false;
                    System.out.println("Exiting ordering system. Thank you!");
                }
                default -> System.out.println("Invalid order. Please try again.");
            }
        }
    }
}