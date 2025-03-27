public class IsPerfectSquare {

    public static void main(String[] args) {
        long i = 6;
        System.out.println("Is perfect? - " + isPerfectSquare(i));
    }

    public static boolean isPerfectSquare(long n) {
//
//        for (int i = 2; i < Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }

        if (Math.sqrt(n) % 1 == 0) {
            return true;
        }
            return false;
        }
    }
