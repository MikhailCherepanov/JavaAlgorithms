public class SumOfDigitsRaisedToPositions {

    public static void main(String[] args) {
        int i = 253;
        System.out.println("getSum - " + sumOfDigitsRaisedToPositions(i));
    }

    public static int sumOfDigitsRaisedToPositions(int n) {
        String s = String.valueOf(n);
        String ns = "";
        char[] arr = s.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            ns = ns + arr[i];
        }
        char[] arr2 = ns.toCharArray();

        int res = 0;

        for (int i = 0; i < arr2.length; i++) {
            int pow = (int) Math.pow(Integer.parseInt(String.valueOf(arr2[i])), i+1);
            res = res + pow;
            System.out.println("pow : " + pow);
        }
        return res;
    }
}
