public class CountMin {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,1};
        System.out.println("Res " + countMin(arr));
    }

    public static int countMin(int[] numbers) {

        if (numbers.length == 0) {
            return 0;
        }

        int min = numbers[0];

        for (int el : numbers) {
            if (el < min) {
                min = el;
            }
        }

        int count = 0;

        for (int el : numbers) {
            if (el == min) {
                count++;
            }

        }
    return count;


    }
}
