import java.util.HashSet;
import java.util.Set;

public class AreCoprime {

    public static void main(String[] args) {
        int n = 2167;
        int m = 2183;
        System.out.println("Are Coprime - " + areCoprime(n,m));
    }
    public static boolean areCoprime(int a, int b) {
        System.out.println("Numbers are : " + a + ", " + b);
        Set<Integer> divisorsA = getDivisors(a);
        Set<Integer> divisorsB = getDivisors(b);
        System.out.println("getDivisors(a) : " + divisorsA);
        System.out.println("getDivisors(b) : " + divisorsB);

        Set<Integer> commonsA = new HashSet<>();
        for (int d : divisorsA) {
            if (divisorsB.contains(d)){
                commonsA.add(d);
            }
        }
        System.out.println("New divisors A : " + commonsA);

        Set<Integer> commonsB = new HashSet<>();
        for (int d : divisorsB) {
            if (divisorsA.contains(d)){
                commonsB.add(d);
            }
        }
        System.out.println("New divisors B : " + commonsB);

        Integer maxA = commonsA.stream().max(Integer::compare).get();
        Integer maxB = commonsB.stream().max(Integer::compare).get();

        if (maxA == 1 && maxB == 1) {
            return true;
        } else {
            return false;
        }
    }

    private static Set<Integer> getDivisors(int n) {
        Set<Integer> divisors = new HashSet<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                divisors.add(n/i);
            }
        }
        return divisors;
    }

}
