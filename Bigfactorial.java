import java.math.BigInteger;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

public class Bigfactorial{

    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        int z = s.nextInt();
        System.out.println(factorial(z));
    }
    private static BigInteger factorial(int z)
    {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= z; i++)
            result = result.multiply(BigInteger.valueOf(i));

        return result;
    }
}

