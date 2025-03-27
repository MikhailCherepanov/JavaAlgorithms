import java.util.*;

public class MergeNSortedLists {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();

        l1.add(100);
        l1.add(200);
        l1.add(300);
        l1.add(400);

        l2.add(150);
        l2.add(250);

        l3.add(500);
        l3.add(600);
        l3.add(700);

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

        List<Integer> res = new ArrayList<>();

//        List<Integer> listsLengths = new ArrayList<>();
//        for (int i = 0; i < lists.size(); i++) {
//            listsLengths.add(lists.get(i).size());
//        }

        int numOfElements = 0;
        for (int i = 0; i < lists.size(); i++) {
            numOfElements = numOfElements + lists.get(i).size();
        }

        Map<List<Integer>, Integer> mapIt = new LinkedHashMap<>();

        for (List<Integer> list : lists) {
            mapIt.put(list, 0);
        }

            boolean brPoint = true;
            while (brPoint) {
                Integer minV = null;
                int liCounter = 0;
                int index = 0;
                for (int i = 0; i < mapIt.size(); i++) {
                    List<Integer> li = (List<Integer>) mapIt.keySet().toArray()[i];
                    int liSize = li.size();
                    int idx = (int) mapIt.values().toArray()[i];
                    index = idx + 1;
                    if (idx >= liSize) {
                        continue;
                    }
                    if (minV == null) {
                        minV = li.get(idx);
                        liCounter = i;
                    }


                    if (li.get(idx) <= minV) {
                        minV = li.get(idx);
                        liCounter = i;
                    }
                }
                res.add(minV);
                mapIt.put((List<Integer>) mapIt.keySet().toArray()[liCounter], index);
                if (res.size() == numOfElements) {
                    brPoint = false;
                }
            }

        return res;
    }


    public static List<Integer> getListKeyFromMap(Map map, int index) {
        return (List<Integer>) ((Map.Entry) map.entrySet().toArray()[index]).getKey();
    }

    public static int getIntValueFromMap(Map map, int index) {
        return (int) ((Map.Entry) map.entrySet().toArray()[index]).getValue();
    }

    public static boolean isLast(Map mapIt, int counter, List<List<Integer>> lists) {
        int tmp = (int) mapIt.values().toArray()[counter];
        if ( tmp < lists.get(counter).size()) {
            return true;
        } else {
            return false;
        }
    }

}