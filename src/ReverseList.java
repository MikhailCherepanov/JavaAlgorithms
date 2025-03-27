import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4);
        System.out.println("solution is: " + reverseList(list));
    }

    public static List<Integer> reverseList(List<Integer> list) {
        System.out.println("LIST : " + list);

        List<Integer> r1 = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
             r1.add(list.get(i));

        }

        return r1;

    }

}
