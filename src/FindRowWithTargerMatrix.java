import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindRowWithTargerMatrix {

    public static void main(String[] args) {
        int target = 10;


//        int[][] matrix = {
//                {         1, 4, 7, 11 },
//                {          2, 5, 8, 12    },
//                {          3, 6, 9, 16  }
//        };

//        int[][] matrix = {
//            {  5, 5  },
//            {  5, 5  }
//        };

//        int[][] matrix = {
//            {           10, 20, 30    },
//            {           40, 50, 60    },
//            {           70, 80, 90  },
//        };

        int[][] matrixNull = {

        };


        int[][] matrix = {
                {  1, 2, 3, 4, 5   }
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
        System.out.println("Row num : " + findRowWithTarget(matrix, target));
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] cols : matrix) {
            for (int rows : cols) {
                System.out.print(rows + " ");
            }
            System.out.println("");
        }
    }

    static int cursor = 0;
    public static void setCursor(int[][] matrix, int row, int col) {
        cursor = matrix[row][col];
    }


    public static Integer findRowWithTarget(int[][] matrix, int target) {
        printMatrix(matrix);
        System.out.println("target : " + target + "\n");

        int row = 0;
        int col = matrix[0].length - 1;
        setCursor(matrix,0,matrix[0].length - 1);


        while (col != 0 || row != matrix.length) {
            if (cursor == target) {
                return row;
            }
            if (cursor < target) {
                ++row;
                if (row > matrix.length - 1) {
                    return null;
                }
                col = matrix[0].length - 1;
                setCursor(matrix, row,  col);
            } else {
                if (cursor > target) {
                    --col;
                    if (col < 0) {
                        return null;
                    }
                    setCursor(matrix, row, col);
                }
            }
        }


//
//
//            if (matrix[i][matrix[i].length-1] == target) {
//                return i;
//            } else {
//                if (matrix[i][matrix[i].length-1] > target) {
//                    for (int j = matrix.length - 1; j >= 0; j--) {
//                        if (matrix[i][j] < target) {
//                            counter = counter + j + 1;
//                            break;
//                        }
//                    }
//                }
//            }
//        }

        return null;
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

