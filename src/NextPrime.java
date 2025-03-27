public class NextPrime {


    public static void main(String[] args) {
        int i = 13;
        System.out.println("nextPrime - " + nextPrime(i));
    }

    public static boolean isPrime(int number) {
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

    public static int nextPrime(int n) {
        boolean f = false;
        int checker = n;
        while (f == false) {
            checker++;
            f = isPrime(checker);
        }
        return checker;

    }

}
