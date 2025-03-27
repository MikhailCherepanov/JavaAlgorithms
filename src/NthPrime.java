import java.util.ArrayList;
import java.util.List;

public class NthPrime {

    public static void main(String[] args) {
        int n = 1;
        System.out.println("Ntn Prime is - " + nthPrime(n));
    }
    public static int nthPrime(int n) {
        NthPrime nthPrime = new NthPrime();
        List<Integer> arr = new ArrayList<>();
        int i = 2;
        while (arr.size() != n) {
            if (nthPrime.isPrime(i)) {
                arr.add(i);
            }
            i++;
        }
        return arr.get(n-1);
    }


    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
