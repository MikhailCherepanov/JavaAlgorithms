import java.util.ArrayList;
import java.util.List;

public class ToeplitzMatrix {

    public static void main(String[] args) {

        int[][] matrix = {
            {  4, 4, 4, 4   },
            {  1, 4, 4, 4   },
            {  4, 1, 4, 4   },
            {  4, 4, 0, 4   }
    };

//        int[][] matrix = {
//                {6, 7, 8  },
//                {4, 6, 7  },
//                {1, 4, 6  }
//        };
        boolean itIs = isToeplitzMatrix(matrix);

        if (itIs) {
            System.out.println("Yes, it is");
        } else {
            System.out.println("No it isn't");
        }
    }






    public static List<Integer> getDiag(int row, int col, int cols, int rows, int[][] matrix) {
        List<Integer> li = new ArrayList<>();
        int coordRow = row;
        int coordCol = col;
        for (int cc = 0; cc < cols; cc++) {
            if ((coordRow + cc) < rows && (coordCol + cc) < cols) {
                li.add(matrix[coordRow + cc][coordCol + cc]);
            }
        }
//        System.out.println("LI : " + li);
        return li;
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {
        for (int[] cols : matrix) {
            for (int rows : cols) {
                System.out.print(rows + " ");
            }
            System.out.println("");
        }

        int diagCounter = 0;
        boolean diagCounterUp = true;
        boolean shouldAdd = false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxDiag = matrix.length;
        List<List<Integer>> diags = new ArrayList<>();
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j < cols; j++) {
                List<Integer> diagLi = getDiag(i,j, cols, rows, matrix);
                if (((diagLi.size() + 1) == diagCounter && diagCounterUp == false)
                        || ((diagLi.size() - 1) == diagCounter && diagCounterUp == true
                        || (shouldAdd == true))) {
                    diags.add(diagLi);
                    if (diagCounter < maxDiag) {
                        diagCounterUp = true;
                        diagCounter++;
                        shouldAdd = false;
                    }
                    if (diagCounter > maxDiag) {
                        diagCounter--;
                        diagCounterUp = false;
                        shouldAdd = false;
                    }
                    if (diagCounter == maxDiag) {
                        diagCounter--;
                        diagCounterUp = false;
                        shouldAdd = true;
                    }
                }
            }
        }

        System.out.println("diags : " + diags);

        for (List<Integer> diag : diags) {
            for (int i : diag) {
                for (int j = 0; j < diag.size(); j++) {
                    if (i != diag.get(j)) {
                        return false;
                    }
                }
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


        return true;
    }

}
