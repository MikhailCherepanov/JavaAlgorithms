import java.util.ArrayList;
import java.util.List;

public class MergeSortedListsDescendingUnique {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        l1.add(-1000000);
        l1.add(-500);
        l1.add(0);
        l1.add(500);
        l1.add(1000000);

        l2.add(-1000000);
        l2.add(-500);
        l2.add(0);
        l2.add(500);
        l2.add(1000000);

        System.out.println("Result: " + mergeSortedListsDescendingUnique(l1, l2));
    }

    public static List<Integer> mergeSortedListsDescendingUnique(List<Integer> list1, List<Integer> list2) {
        System.out.println("List 1 : " + list1);
        System.out.println("List 2 : " + list2);

        List<Integer> res = new ArrayList<>();

        int i = list1.size() - 1, j = list2.size() - 1;

        while (i >= 0 && j >= 0) {
            if (list1.get(i) > list2.get(j)) {
                if (res.size() == 0 || (int) res.get(res.size() - 1) != (int) list1.get(i)) {

                    res.add(list1.get(i));
                }
                i--;
            } else {
                if (res.size() == 0 || (int) res.get(res.size() - 1) != (int) list2.get(j)) {
                    res.add(list2.get(j));
                }
                j--;
            }
        }

        while (i >= 0) {
            if ((int) res.get(res.size() - 1) != (int) list1.get(i)) {
                res.add(list1.get(i));
            }
            i--;
        }

        while (j >= 0) {
            if ((int) res.get(res.size() - 1) != (int) list2.get(j)) {
                res.add(list2.get(j));
            }
            j--;
        }

        return res;
    }
}