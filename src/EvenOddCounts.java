public class EvenOddCounts {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Res " + solution(arr));
    }

    public static int[] solution(int[] nums) {
        int evens = 0;
        int odds = 0;

        for (int el : nums) {
            if (el%2 == 0) {
                evens++;
            } else {
                odds++;
            }
        }

        System.out.println("evens : " + evens);
        System.out.println("odds : " + odds);

        return new int[] {evens, odds};


    }
}