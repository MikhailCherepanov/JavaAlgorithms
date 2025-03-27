import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Uniques {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 200, 300, 400, 500, 600, 700, 800, 900, 1000);
        System.out.println("solution is: " + countUniqueElements(list));
    }

    public static int countUniqueElements(List<Integer> list) {
        System.out.println("LIST : " + list);
        List<Integer> resUnique = new ArrayList<>();
        List<Integer> resNotUnique = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            boolean isUnique = true;
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    isUnique = false;
                }
            }
            if (isUnique) {
                resUnique.add(list.get(i));
            } else {
                resNotUnique.add(list.get(i));
            }
        }

        List<Integer> res = new ArrayList<>();

        for (Integer l : list) {
            boolean toAdd = false;
            for (Integer re : resNotUnique) {
                if (re == l) {
                    toAdd = false;
                    break;
                } else {
                    toAdd = true;
                }
            }
            if (toAdd) {
                res.add(l);
            }
        }

        System.out.println("resUnique : " + resUnique);
        System.out.println("resNotUnique : " + resNotUnique);
        System.out.println("res : " + res);
        return res.size();
    }

}
