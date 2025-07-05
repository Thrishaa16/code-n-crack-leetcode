import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        // Convert binary strings to BigInteger
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);

        // Add the BigIntegers
        BigInteger sum = num1.add(num2);

        // Convert the sum back to a binary string
        return sum.toString(2);
    }
}