import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArrayGroups {

    public static void main(String[] args) {
        int k = 3;
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("result is : ");
        new PrintArray().print(solution(nums, k));
    }

    public static List<Integer> rotateTrinity(List<Integer> trinity, int k, List<Integer> news) {
        List<Integer> li = new ArrayList<>();
        for (int j = trinity.size() - 1; j >= 0; j--) {
            li.add(trinity.get(j));
        }
        news.addAll(li);
        return news;
    }


    public static int[] solution(int[] numbers, int k) {
        new PrintArray().printArrayAndK(numbers, k);

        List<Integer> trinity = new ArrayList<>();
        List<Integer> news = new ArrayList<>();
        int counter = 1;

        for (int i = 0; i < numbers.length; i++) {
            trinity.add(numbers[i]);
            if (counter == k) {
                news = rotateTrinity(trinity, k, news);
                counter = 1;
                trinity = new ArrayList<>();
            } else {
                if (counter < k) {
                    counter++;
                    if (i == numbers.length -1) {
                        news = rotateTrinity(trinity, k, news);
                        break;
                    }
                }
            }
        }


        Integer[] newsArrI = new Integer[numbers.length];
        int[] newsArr = new int[numbers.length];
        news.toArray(newsArrI);
        for (int i = 0; i < newsArr.length; i++) {
            newsArr[i] = newsArrI[i];
        }

        return newsArr;
    }
}