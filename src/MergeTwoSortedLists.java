import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedLists {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        l1.add(1);
        l1.add(3);
        l1.add(5);
        l1.add(7);
        l1.add(9);

        l2.add(2);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(6);
        l2.add(6);

        System.out.println("Result: " + solution(l1, l2));
    }

    public static List<Integer> solution(List<Integer> l1, List<Integer> l2) {
        System.out.println("List 1 : " + l1);
        System.out.println("List 2 : " + l2);

        List<Integer> res = new ArrayList<>();

        int i = 0, j = 0;

        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) < l2.get(j)) {
                res.add(l1.get(i));
                i++;
            } else {
                res.add(l2.get(j));
                j++;
            }
        }

        while (i < l1.size()) {
            res.add(l1.get(i));
            i++;
        }

        while (j < l2.size()) {
            res.add(l2.get(j));
            j++;
        }

        return res;
    }
}