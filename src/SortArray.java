public class SortArray {

    public static void main(String[] args) {
        int[] arr = {3,7,20,9,1,54,0};

        int[] arr2 = sortArray(arr);

        System.out.println("Array Bubble Sorted : ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ", ");
        }
    }

    public static int[] sortArray(int[] arr) {
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1+i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }



}