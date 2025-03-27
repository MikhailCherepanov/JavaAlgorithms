import java.util.ArrayList;
import java.util.List;

public class GetPrimeFactors {

    public static void main(String[] args) {
        int i = 123456;
        System.out.println("getPrimeFactors - " + getPrimeFactors(i));
    }

    public static List<Integer> getPrimeFactors(int n) {

        System.out.println("Number is : " + n);

        List<Integer> primeFactors = new ArrayList<>();

        if (n % 2 == 0) {
            primeFactors.add(2);
            while (n % 2 == 0) {
                n /= 2;
            }
        }

        // Check for odd factors from 3 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                primeFactors.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }

        // If n is still greater than 2, it must be a prime number
        if (n > 2) {
            primeFactors.add(n);
        }

        return primeFactors;

    }
}
