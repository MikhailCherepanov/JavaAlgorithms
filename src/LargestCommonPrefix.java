
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LargestCommonPrefix {
    public static void main(String[] args) {

        String[] words = {"run", "rune" , "array"};
//        String[] words = {"base", "ball" , "bat"};

        System.out.println("Result: " + largestCommonPrefix(words));
    }


    public static List<Character> toCharList(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
    }

    public static boolean isPrefix(String[] words, String prefix) {
        boolean isPref = false;
        for (String word : words) {
            char chWo = word.toCharArray()[0];
            char chPr = prefix.toCharArray()[0];

            if (word.contains(prefix) && chWo == chPr) {
                isPref = true;
            } else {
                isPref = false;
                break;
            }
        }
        return isPref;
    }

    public static String largestCommonPrefix(String[] words) {
        System.out.println("Strings : ");
        Arrays.asList(words).stream().forEach(System.out::println);

        String firstWord = words[0];
        List<Character> charList = toCharList(firstWord);
        String prefix = firstWord;

        for (int i = 0; i < charList.size(); i++) {
            prefix = firstWord.substring(0, firstWord.length() - i);

            if (isPrefix(words, prefix)) {
                return prefix;
            }
        }
        return "";
    }
}