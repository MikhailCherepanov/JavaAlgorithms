import java.util.ArrayList;
import java.util.List;

import static java.lang.Long.toBinaryString;

public class Assignment02Sonar {

    public static void main(String[] args) {
        int A = 300;
        int B = 56780;

        System.out.println("Res : " + solution(A, B));
    }

    public static int solution(int A, int B) {
        String str = Integer.toBinaryString(A * B);
        char[] chArr = str.toCharArray();
        int counter = 0;
        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] == '1') {
                counter++;
            }
        }
        return counter;
    }

}
