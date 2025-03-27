import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftListElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-1000, -999, -998, -997, -996);
        int shift = -1000;
        System.out.println("solution is: " + shiftListElements(list, shift));
    }

    public static List<Integer> shiftListElements(List<Integer> ls, int shift) {
        System.out.println("LIST : " + ls);
        System.out.println("shift : " + shift);

        List<Integer> r1 = new ArrayList<>();

        if (Math.abs(shift) > ls.size()) {
            shift = shift%ls.size();
        }

            if (shift >= 0) {
                shift = ls.size()-shift;
            } else {
                shift = Math.abs(shift);
            }
            for (int i = 0; i < ls.size(); i++) {
                if (i+shift < ls.size()) {
                    r1.add(ls.get(i+shift));
                } else {
                    r1.add(ls.get(i+shift-ls.size()));
                }
            }

        return r1;

    }

}
