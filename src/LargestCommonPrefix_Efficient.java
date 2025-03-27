
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LargestCommonPrefix_Efficient {
    public static void main(String[] args) {

//        String[] words = {"run", "rune" , "array"};
        String[] words = {"base", "ball" , "bat"};

        System.out.println("Result: " + efficient_LCP(words));
    }

    public static String efficient_LCP(String[] strs) {
        System.out.println("Strings : ");
        Arrays.asList(strs).stream().forEach(System.out::println);

        List<String> li = Arrays.stream(strs).sorted().collect(Collectors.toList());

        String firstWord = li.get(0);
        String lastWord = li.get(li.size() - 1);

        char[] firstCh = firstWord.toCharArray();
        char[] lastCh = lastWord.toCharArray();

        int minLength = firstCh.length > lastCh.length ? lastCh.length : firstCh.length;

        String res = "";
        for (int i = 0; i < minLength; i++) {
            boolean isIt = false;
            if (firstCh[i] == lastCh[i]) {
                isIt = true;
                res = res + firstCh[i];
            } else {
                isIt = false;
                return res;
            }
        }
        return res;
    }
}