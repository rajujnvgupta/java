
import java.math.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
         BigInteger z = sc.nextBigInteger();
         System.out.println(f(z));
    }

    private static BigInteger f(BigInteger n){
        BigInteger ans = BigInteger.ONE;
        BigInteger x = n.multiply(n);
        //BigInteger y = x.multiply(BigInteger.valueOf(n));
        BigInteger y = x.multiply(n);

        ans = y.multiply(BigInteger.valueOf(4)).add(x.multiply(BigInteger.valueOf(5))).subtract(n.multiply(BigInteger.valueOf(6))).add(BigInteger.valueOf(14));
        return ans;
    }
}
