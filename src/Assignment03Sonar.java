import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment03Sonar {

    public static void main(String[] args) {
        int[] A = {4,3,2,5,1,1};

        System.out.println("Res : " + solution(A));
    }

    public static int solution(int[] A) {
        int maxValue = 0;
        for (int k = 0; k < A.length - 1; k++) {
            List<Integer> lefts = new ArrayList<>();
            List<Integer> rights = new ArrayList<>();
            for (int i = 0; i < A.length; i++) {
                if (i <= k) {
                    lefts.add(A[i]);
                } else {
                    rights.add(A[i]);
                }
            }
            int leftMax = Collections.max(lefts);
            int rightMax = Collections.max(rights);

            int res = Math.abs(leftMax - rightMax);

            if (res > maxValue) {
                maxValue = res;
            }
        }
        return maxValue;
    }

}
