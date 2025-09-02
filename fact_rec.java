import java.math.BigInteger;
import java.util.Scanner;

public class fact_rec {
    // Recursive factorial using BigInteger
    BigInteger factorial(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE; // base case
        }
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fact_rec a = new fact_rec();

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        BigInteger fact = a.factorial(n);
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}

