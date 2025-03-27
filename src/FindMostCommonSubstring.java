import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostCommonSubstring {
    public static void main(String[] args) {
        String str = "abcdefgh";
        int le = 8;
        System.out.println("Result: " + findMostCommonSubstring(str, le));
    }

    public static String findMostCommonSubstring(String s, int length) {
        System.out.println("String : " + s);
        System.out.println("length : " + length);

        if (s.length() == length) {
            return s;
        }

        if (s.length() < length || s.length()/2 < length) {
            return "";
        }


        List<String> commonSubs = new ArrayList<>();

        for (int i = 0; i <= s.length() - length; i++) {
            String subs = "";
            for (int j = 0; j < length; j++) {
                 subs = subs + s.charAt(i+j);
            }
            commonSubs.add(subs);
        }

        Map<String, Long> comMap = commonSubs.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Long maxV = comMap.entrySet().stream().toList().get(0).getValue();
        for (Map.Entry en : comMap.entrySet()) {
            if ((Long) en.getValue() > maxV) {
                maxV = (Long) en.getValue();
            }
        }

        final int maxVF = Math.toIntExact(maxV);
        Map<String, Long> comMapMax = comMap.entrySet().stream().filter(a -> a.getValue() >= maxVF).collect(Collectors.toMap(a -> a.getKey(), a -> a.getValue()));

        Optional<String> newLi = comMapMax.keySet().stream().sorted().findFirst();

        return newLi.get();
    }
}