public class ProfitAndLoss{
    public static void main(String[] agrs){
        double costPrice = 129;
        double sellingPrice=191;
        double profit = sellingPrice - costPrice; // Calculate profit
        double profitPercentage = (profit / costPrice) * 100; // Calculate profit percentage
        System.out.print("The codt price is INR"+costPrice+"The selling price is INR"+sellingPrice);
        System.out.print("The profit is INR"+profit+"The profit percentage is "+profitPercentage+"%");
    }
}