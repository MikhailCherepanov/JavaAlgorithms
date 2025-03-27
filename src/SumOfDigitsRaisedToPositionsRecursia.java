public class SumOfDigitsRaisedToPositionsRecursia {

    public static void main(String[] args) {
        int i = 253;
        System.out.println("getSum - " + sumOfDigitsRaisedToPositions(i));
    }

    static int position = 0;
    static int  res = 0;


    public static int sumOfDigitsRaisedToPositions(int n) {
        if (n == 0) {
            return res;
        }
        int number = n % 10;
        res = res + (int) Math.pow(number, ++position);
        return sumOfDigitsRaisedToPositions(n / 10);
    }


}
