import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShuffleArray {

    public static void main(String[] args) {
//        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7);
//        int k = 3;
        List<Integer> nums = List.of(766, 243, -12, 24, 0, 41);
        int k = 2;


        System.out.println("init list is : " + nums);
        System.out.println("K is : " + k);
        System.out.println("result is : " + shuffleArray(nums, k));
    }

    public static List<Integer> shuffleArray(List<Integer> nums, int k) {

        Integer[] array = new Integer[nums.size()];
        nums.toArray(array);

        int counter = 1;

        List<Integer> news = new ArrayList<>();
        List<Integer> olds = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (counter > k) {
                counter = 1;
            }
            if (counter < k) {
                olds.add(array[i]);
            }
            if (counter == k) {
                news.add(array[i]);
            }
            counter++;
        }
        System.out.println("olds : " + olds);
        System.out.println("news : " + news);
        olds.addAll(news);



//        for (int i = 0; i < array.length; i++) {
//            if (counter > k) {
//                counter = 1;
//            }
//            if (counter == k) {
//                int number = array[i];
//                for (int j = i; j < array.length - 1 ; j++) {
//                     array[j] = array[j + 1];
//                }
//                array[array.length - 1] = number;
//                i--;
//            }
//            counter++;
//        }
//        List<Integer> li = Arrays.asList(array);
        return olds;
    }
}