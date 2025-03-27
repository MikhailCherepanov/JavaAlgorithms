import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 5};

        int[] newArr = selectionSort(arr);

        System.out.println("Sorted array: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int[] tmpArr = new int[arr.length - i];

            for (int j = i; j < tmpArr.length; j++) {
                tmpArr[j-i] = arr[j];
            }

            int minIndex = getMinIndex(tmpArr);
            int minV = tmpArr[minIndex];

            int tmp = arr[i];
            arr[minIndex] = tmp;
            arr[i] = minV;

        }
        return arr;
    }


    public static int getMinIndex(int[] arr) {
        int minV = arr[0];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minV) {
                minV = arr[i];
                idx = i;
            }
        }
        return idx;
    }

}

