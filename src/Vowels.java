import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vowels {
    public static void main(String[] args) {

        System.out.println("Solution is : " + solution2("Hello WORLD"));

    }

    public static List<Integer> solution(String s) {
        char[] vowels = {'a', 'o', 'e', 'i', 'u'};
        List<Integer> res = new ArrayList<>();
        char[] ch = s.toLowerCase().toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (char j : vowels) {
                if (ch[i] == j ) {
                    res.add(i);
                }
            }
        }
        return res;
    }

    public static List<Integer> solution2(String s) {
        char[] vowels = {'a', 'o', 'e', 'i', 'u', 'A', 'O', 'E', 'I', 'U'};
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (char j : vowels) {
                if (s.charAt(i) == j ) {
                    res.add(i);
                }
            }
        }
        return res;
    }

}
