import java.util.ArrayList;
import java.util.List;

public class SecondMax {
    public static void main(String[] args) {
//        int[] arr = {2,1,1,1,2,2,3,4,5,1,1};
        int[] arr = {999999, 1000000};
        System.out.println("Res " + secondMax(arr));
    }


    public static Integer secondMax(int[] nums) {
        System.out.print("Provided : ");
        for (int i : nums) {
            System.out.print(i + ", ");
        }
        System.out.print("\n");

        if (nums.length == 0) {
            return null;
        }

        List<Integer> uniques = new ArrayList<>();
        boolean unique = false;
        uniques.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < uniques.size(); j++) {
                if (nums[i] == uniques.get(j)) {
                    unique = false;
                    break;
                } else {
                    unique = true;
                }
            }
            if (unique) {
                uniques.add(nums[i]);
            }
        }
        System.out.println("uniques : " + uniques);

        if (uniques.size() < 2) {
            return null;
        }

        int max = nums[0];

        for (int el : nums) {
            if (el > max) {
                max = el;
            }
        }

        System.out.println("max : " + max);

        uniques.remove((Integer) max);
        int secMax = uniques.get(0);

        for (int el : uniques) {
            if (el > secMax && el != max) {
                secMax = el;
            }
        }

        System.out.println("secMax : " + secMax);

        return secMax;
    }
}
