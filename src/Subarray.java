import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Subarray {

    public static void main(String[] args) {
        int[] listA = {5, 4, 3, 2, 1};
        int[] listB = {3, 2, 1};

        System.out.println("solution is: " + solution(listA, listB));
    }
    public static boolean solution(int[] listA, int[] listB) {

        Arrays.stream(listA).forEach(a -> System.out.print(a + ", "));
        System.out.println();
        Arrays.stream(listB).forEach(a -> System.out.print(a + ", "));
        System.out.println();

        int seqQ = listB.length;
        for (int k = 0; k < listA.length; k++) {
            int counter = k;
            boolean seq = false;
            int seqL = seqQ;
            for (int i = 0; i < listB.length; i++) {

                if (listA[counter] == listB[i]) {
                    seq = true;
                    counter++;
                    if (seqL == 0) {
                        return true;
                    }
                    seqL--;
                    if (counter == listA.length) {
                        if (seqL == 0 && seq == true) {
                            return true;
                        }
                        break;
                    }

                } else {
                    seq = false;
                    break;
                }
                System.out.println("seqL : " + seqL);
                if (i == listB.length - 1 && seq == true && seqL <= 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
