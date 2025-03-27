public class GetSum {

    public static void main(String[] args) {
        int i = 5;
        System.out.println("getSum - " + getSum(i));
    }

    public static int getSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + getSum(n-1);
    }


}
