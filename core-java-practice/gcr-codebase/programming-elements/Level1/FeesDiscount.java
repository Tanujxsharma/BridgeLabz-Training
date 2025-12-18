public class FeesDiscount {
    public static void main(String[] args){
        int fees = 125000;
        int discountPersentage = 10;
        int discountedAmount= (fees * discountPersentage)/100; // Calculate discounted amount
        int finalFees = fees - discountedAmount; // Calculate final fees after discount
        System.out.print("the discounted amount is INR "+discountedAmount+" and the final discounted fees is INR "+finalFees);
    }
}