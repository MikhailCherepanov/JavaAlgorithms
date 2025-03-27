import java.lang.reflect.AnnotatedType;
import java.util.*;
import java.util.stream.Collectors;

public class Uniques2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4);
        System.out.println("solution is: " + countUniqueElements(list));
    }

    public static int countUniqueElements(List<Integer> list) {
        System.out.println("LIST : " + list);
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : list) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> r3 = new ArrayList<>();
        countMap.forEach((k,v) -> {
           if (v == 1 ) {
               r3.add(k);
           }
        });

        return r3.size();

    }

}
