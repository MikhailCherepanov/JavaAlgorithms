public class AntiArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println("K is : " + k);
        System.out.print("Init array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        int[] solution = antiRotateArray(arr, k);
        System.out.print("Array rotated is : ");
        for (int i = 0; i < solution.length; i++) {
            System.out.print(solution[i] + ", ");
        }
    }

    public static int[] antiRotateArray(int[] arr, int k) {
        k = k < arr.length ? k : k % arr.length;
        int counter = 0;
        while (counter != k) {
            int first = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if ((i + 1) == arr.length) {
                    arr[i] = first;
                } else {
                    arr[i] = arr[i + 1];
                }
            }
            counter++;
        }
        return arr;
    }
}
