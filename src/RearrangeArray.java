import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArray {
    public static void main(String[] args) {

        rearrangeArray(nums);
    }

    static int[] nums = {1, 3, 5, 7, 9, 2, 4, 6, 8};
//    static int[] nums = {1000, 2000, 3, 4000, 5000, 6000, 7000, 8000};

    static int[] result = {5, 7, 9, 2, 1, 3, 4, 6, 8};


    public static void rearrangeArray(int[] nums) {

        System.out.print("Array is ");
        for (int o : nums) {
            System.out.print(o + ", ");
        }
        System.out.println();

        int quarterLength = nums.length / 4;
        int lastQuarterLength = quarterLength + nums.length % 4;

        int[] quarter1 = new int[quarterLength];
        int[] quarter2 = new int[quarterLength];
        int[] quarter3 = new int[lastQuarterLength];
        int[] quarter4 = new int[quarterLength];

        for (int i = 0; i < quarterLength; i++) {
            quarter1[i] = nums[i];
        }
        for (int i = quarterLength; i < quarterLength * 2; i++) {
            quarter2[i - quarterLength] = nums[i];
        }
        for (int i = quarterLength  * 2; i < (quarterLength * 2) + lastQuarterLength; i++) {
            quarter3[i - (quarterLength  * 2)] = nums[i];
        }
        for (int i = (quarterLength * 2) + lastQuarterLength; i < (quarterLength * 3) + lastQuarterLength; i++) {
            quarter4[i - (quarterLength * 2 + lastQuarterLength)] = nums[i];
        }

        List<Integer> li = new ArrayList<>() {{
            addAll(addArr(quarter2));
            addAll(addArr(quarter3));
            addAll(addArr(quarter1));
            addAll(addArr(quarter4));
        }};

        for (int i = 0; i < nums.length; i++) {
            nums[i] = li.get(i);
        }

        System.out.print("Final Array is ");
        for (int o : nums) {
            System.out.print(o + ", ");
        }
    }

    public static List<Integer> addArr(int[] arr) {
        return new ArrayList<>() {{
            for (int i : arr) {
                add(i);
            }
        }};
    }

}