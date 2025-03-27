
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        int[] nums = {1,0,0};


        List<String> words = new ArrayList<>(
                Arrays.asList("one.two.three",
                        "four.five","six"));
        String separator = ".";


        System.out.println(splitWordsBySeparator(words, separator));
    }


    public static List<String> splitWordsBySeparator(List<String> words, String separator) {
        List<String> res = new ArrayList<>();
        words.forEach(s -> {
                    for (String a : s.split("\\"+separator))
                    res.add(a);
                }
        );
        return res;
    }



    public static boolean isOneBitCharacter(int[] bits) {

        if (bits[bits.length-2] == 1) {
            return false;
        }
        if (bits[bits.length-3] == 1) {
            return false;
        }
        return true;

    }
}