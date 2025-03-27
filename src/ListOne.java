import java.util.Arrays;
import java.util.List;

public class ListOne {
    public static void main(String[] args) {
        int n = 2;
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4);
        System.out.println("solution is: " + solution(list, n));
    }

    public static int solution(List<Integer> list, int val) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == val) {
                return i;
            }
        }
        return -1;
    }

}
