import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveCommonElements {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        l1.add(2);
        l1.add(5);
        l1.add(7);
        l1.add(10);

        l2.add(1);
        l2.add(5);
        l2.add(9);

        System.out.println("Result: " + removeCommonElements(l1, l2));
    }

    public static List<Integer> removeCommonElements(List<Integer> list1, List<Integer> list2) {
        System.out.println("List 1 : " + list1);
        System.out.println("List 2 : " + list2);

        List<Integer> res = new ArrayList<>();

        int i = 0, j = 0, k = 0;

        List<Integer> l3 = new ArrayList<>();
        l3.addAll(list1);
        l3.addAll(list2);

        Map<Integer, Long> mapAll = new HashMap<>();
        mapAll = l3.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        mapAll = mapAll.entrySet().stream().filter(a -> a.getValue() != 1).collect(Collectors.toMap(a->a.getKey(), a-> a.getValue()));

        Set<Integer> lll =  mapAll.keySet();

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                if (!lll.contains(list1.get(i))) {
                    res.add(list1.get(i));
                }
                i++;
            } else {
                if (!lll.contains(list2.get(j))) {
                    res.add(list2.get(j));
                }
                j++;
            }
        }

        while (i < list1.size()) {
            if (!lll.contains(list1.get(i))) {
                res.add(list1.get(i));
            }
            i++;
        }

        while (j < list2.size()) {
            if (!lll.contains(list2.get(j))) {
                res.add(list2.get(j));
            }
            j++;
        }

        return res;
    }
}