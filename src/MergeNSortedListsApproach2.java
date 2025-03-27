import java.util.ArrayList;
import java.util.List;

public class MergeNSortedListsApproach2 {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();

        l1.add(1);
        l1.add(4);
        l1.add(7);

        l2.add(2);
        l2.add(5);
        l2.add(8);

        l3.add(3);
        l3.add(6);
        l3.add(9);

        List<List<Integer>> lists = new ArrayList<>();

        lists.add(l1);
        lists.add(l2);
        lists.add(l3);

        System.out.println("Result: " + mergeNSortedLists(lists));
    }

    public static List<Integer> mergeNSortedLists(List<List<Integer>> lists) {
        for (int i = 0; i < lists.size(); i++) {
            System.out.println("List " + (i+1) + " : " + lists.get(i));
        }

        List<Integer> tmpRes1 = new ArrayList<>();

        int numOfElements = 0;
        for (int i = 0; i < lists.size(); i++) {
            numOfElements = numOfElements + lists.get(i).size();
        }

        for (List<Integer> list : lists) {
            for (Integer i : list) {
                tmpRes1.add(i);
            }
        }

        List<Integer> resNew = new ArrayList<>();
        List<Integer> resOld = new ArrayList<>();
        resOld = removeMinElementsFromList(tmpRes1);
        resNew = addMinElementsToList(tmpRes1);

        while (resNew.size() != numOfElements) {
            resNew.addAll(addMinElementsToList(resOld));
            resOld = removeMinElementsFromList(resOld);
        }

        return resNew;
    }


    public static List<Integer> addMinElementsToList(List<Integer> list) {
        List<Integer> rr = new ArrayList<>();
        int min = list.stream().mapToInt(v -> v).min().getAsInt();
        for (Integer i : list) {
            if (i == min) {
                rr.add(i);
            }
        }
        return rr;
    }

    public static List<Integer> removeMinElementsFromList(List<Integer> list) {
        List<Integer> rr = new ArrayList<>();
        int min = list.stream().mapToInt(v -> v).min().getAsInt();
        for (Integer i : list) {
            if (i != min) {
                rr.add(i);
            }
        }
        return rr;
    }
}