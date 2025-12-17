import java.math.BigInteger;
class AddBinary {
    public String addBinary(String a, String b) {
        BigInteger num = new BigInteger(a,2); // stroring binary string as a number
        BigInteger num1 = new BigInteger(b,2); // stroring binary string as a number
        BigInteger sum = num.add(num1); // adding two binary numbers
        return sum.toString(2); // converting sum to binary string
    }
}