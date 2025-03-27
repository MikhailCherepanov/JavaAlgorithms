import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class LongestCommonSuffix {
    public static void main(String[] args) {
        String[] strs = {"barking", "parking", "starking"};
//        String[] strs = {};
//        String[] strs = {"ab", "abc", "abcd"};

        System.out.println("Result: " + solution(strs));
    }

    public static boolean isLast(String str, String st) {
        int minLe = 0;
        if (str.length() >= st.length()) {
            minLe = st.length();
            return st.equals(str.substring(str.length() - minLe, str.length()));
        } else {
            minLe = str.length();
            return str.equals(st.substring(st.length() - minLe, st.length()));
        }
    }

    public static boolean isInclude(String[] strs, String st) {
        boolean isIt = false;
        for (String s : strs) {
            if (s.contains(st) && isLast(s, st)) {
                isIt = true;
            } else {
                isIt = false;
                break;
            }
        }
        return isIt;
    }

    public static String solution(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        System.out.print("strs: ");
        for (String s : strs) {
            System.out.print(s + ", ");
        }
        System.out.println();



        String res = "";
        boolean isSuffix = false;

        for (int i = 0; i < strs[0].length(); i++) {
            if (isInclude(strs, strs[0].substring(i, strs[0].length()))) {
                isSuffix = true;
            } else {
                isSuffix = false;
            }
            if (isSuffix) {
                return strs[0].substring(i, strs[0].length());
            }
        }
        return res;
    }
}