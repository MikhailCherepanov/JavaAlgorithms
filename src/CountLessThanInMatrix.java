import java.util.ArrayList;
import java.util.List;

public class CountLessThanInMatrix {

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
                {  -1, 2, 3, 4   },
                {   2, 3, 4, 5   },
                {   3, 4, 5, 6   },
                {   4, 5, 6, 7   }
        };


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
        System.out.println("Totally : " + countLessThan(matrix, target));
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] cols : matrix) {
            for (int rows : cols) {
                System.out.print(rows + " ");
            }
            System.out.println("");
        }
    }

    public static int countLessThan(int[][] matrix, int target) {
        printMatrix(matrix);
        System.out.println("Target : " + target);
        int counter = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][matrix[i].length-1] < target) {
                counter = counter + matrix.length;
                System.out.println("");
            } else {
                if (matrix[i][matrix[i].length-1] >= target) {
                    for (int j = matrix.length - 1; j >= 0; j--) {
                        if (matrix[i][j] < target) {
                            counter = counter + j + 1;
                            break;
                        }
                    }
                }
            }
        }


//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (matrix[i][j] != target && matrix[i][j] < target) {
//                    counter++;
//                } else {
//                    break;
//                }
//            }
//        }
        return counter;
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

