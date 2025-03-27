import java.util.*;
import java.util.stream.Collectors;

public class StringIntersectionInOrder {
    public static void main(String[] args) {
        String string1 = "apple";
        String string2 = "peach";
        System.out.println("Result: " + solution(string1, string2));
    }

    public static LinkedHashMap<Character, Long> addToMap(List<Character> li) {
        LinkedHashMap<Character, Long> theMap = new LinkedHashMap<>();
        for (char ch : li) {
            if (theMap.keySet().contains(ch)) {
                Long val = theMap.get(ch);
                theMap.put(ch, val+1);
            } else {
                theMap.put(ch, 1L);
            }
        }
        return theMap;
    }

    public static List<Character> toCharList(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
    }

    public static String solution(String string1, String string2) {
        System.out.println("string1 : " + string1);
        System.out.println("string2 : " + string2);

        String string3 = "";

        List<Character> appleList = toCharList(string1);
        List<Character> peachList = toCharList(string2);

        System.out.println("appleList : " + appleList);
        System.out.println("peachList : " + peachList);

        LinkedHashMap<Character, Long> appleMap = addToMap(appleList);
        LinkedHashMap<Character, Long> peachMap = addToMap(peachList);


        System.out.println("appleMap : " + appleMap.keySet());
        System.out.println("peachMap : " + peachMap.keySet());

        for (char aa : appleList) {
            if (peachMap.keySet().contains(aa)) {
                List<Character> str3List = toCharList(string3);
                LinkedHashMap<Character, Long> str3Map = addToMap(str3List);

                if (appleMap.get(aa) <= peachMap.get(aa) || !str3Map.keySet().contains(aa)) {
                    string3 = string3 + aa;
                }

//                Long num = appleMap.get(aa) <= peachMap.get(aa) ? appleMap.get(aa) : peachMap.get(aa);
//                for (int i = 0; i < num; i++) {
//                    string3 = string3 + aa;
//                }
            }
        }

        return string3;
    }
}