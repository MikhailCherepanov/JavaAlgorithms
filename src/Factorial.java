
public class Factorial {

    public int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: multiply n by factorial of n-1
        else {
            int fn = factorial(n - 1);
            int rr = n * fn;
            return rr;
        }
    }

    public static void main(String[] args) {
        Factorial solution = new Factorial();
        // Example usage
        System.out.println(solution.factorial(5));  // Outputs 120
    }
}
