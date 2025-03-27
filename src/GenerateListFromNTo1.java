import java.util.ArrayList;
import java.util.List;

public class GenerateListFromNTo1 {

    public static void main(String[] args) {
        int i = 5;
        System.out.println("getSum - " + generateListFromNTo1(i));
    }

    public static List<Integer> generateListFromNTo1(int n) {
        if (n == 1) {
            return new ArrayList<>() {{
                add(1);
            }};
        }

        return new ArrayList<>() {{
            add(n);
            addAll(generateListFromNTo1(n -1));
        }};

    }

}
