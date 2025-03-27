import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatSubstring {
    public static void main(String[] args) {
        String str = "abababcbcbcbc";

        System.out.println("Result: " + repeatSubstring(str));
    }

    public static List<Character> toCharList(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
    }

    public static String repeatSubstring(String s) {
        System.out.println("String : " + s);

        List<Character> sList = toCharList(s);

        List<String> li = new ArrayList<>();

        String ex = "";
        for (int i = 0; i < s.length()-1; i++) {
            ex = ex + sList.get(i);
            if (getSubstring(s, ex).length() > 0) {
                li.add(ex);
            }
        }

        if (li.size() == 1) {
            return li.get(0);
        }

        if (li.size() == 0) {
            return "";
        }
        Map<String, Integer> liMap = li.stream().collect(Collectors.toMap(a-> a, a-> a.length()));

        Map.Entry<String, Integer> en = liMap.entrySet().stream().toList().get(0);

        for (Map.Entry<String, Integer> entry : liMap.entrySet()) {
            if (entry.getValue() > en.getValue()) {
                en = entry;
            }
        }

        return en.getKey();
    }

    public static String getSubstring(String str, String subStr) {
        if (!str.contains(subStr)) {
            return "";
        }
        if (str.length() % subStr.length() != 0) {
            return "";
        }
        int devNums = str.length() / subStr.length();

        String res = "";
        for (int i = 0; i < devNums; i++) {
             res = res + subStr;
        }

        if (res.contentEquals(str)) {
            return subStr;
        } else {
            return "";
        }
    }
}