import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinAndMaxInDiagOfMatrix {

    public static void main(String[] args) {
        int target = 5;
        //        int target = 2;

//        int[][] matrix = {
//                {  1, 2  },
//                {  2, 3  }
//        };

//        int[][] matrix = {
//            {  5, 5  },
//            {  5, 5  }
//        };

        int[][] matrix = {
                {  -1, 2, 3, 8   },
                {   2, 3, 2, 5   },
                {   3, 4, 5, 6   },
                {   1, 5, 6, 7   }
        };

        int[][] matrixNull = {

        };


//        int[][] matrix = {
//                {  -1, 2, 3, 4   },
//                {   2, 3, 4, 5   },
//                {   3, 4, 5, 6   },
//                {   4, 5, 6, 7   }
//        };


//        int[][] matrix = {
//            {  -10, -5,  0,  5   },
//            {    0,  5,  10, 15   },
//            {    10, 15, 20, 25   },
//            {    20, 25, 30, 35  }
//        };

        //        int[][] matrix = {
//            {  1, 2, 3, 4   },
//            {  2, 3, 4, 5   },
//            {  3, 4, 5, 6   },
//            {  4, 5, 6, 7   }
//        };
        System.out.println("Min and Max : " + solution(matrixNull));
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] cols : matrix) {
            for (int rows : cols) {
                System.out.print(rows + " ");
            }
            System.out.println("");
        }
    }

    public static List<Integer> solution(int[][] matrix) {
//        printMatrix(matrix);
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0 ) {
            res.add(null);
            res.add(null);
            return res;
        }
        List<Integer> li = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            li.add(matrix[i][matrix.length - 1 - i]);
        }
        System.out.println("li : " + li);

        res.add(Collections.min(li));
        res.add(Collections.max(li));

        return res;
    }
}

//

//            0:0
//            1:1
//            2:2
//
//            0:1
//            1:2
//
//            0:2
//
//             ---
//            1:0
//            2:1
//
//            2:2
//          ============

//            0:3
//            1:2
//            2:1
//            3:0

