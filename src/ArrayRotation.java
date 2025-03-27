public class ArrayRotation {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] solution = solution(arr);
        System.out.print("Array rotated is : ");
        for (int i = 0; i < solution.length; i++) {
            System.out.print(solution[i] + ", ");
        }
    }

    public static int[] solution(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int tmp1 = arr[i];
            int tmpE = arr[arr.length - 1 - i];
            arr[i] = tmpE;
            arr[arr.length-1 - i] = tmp1;
        }
        return arr;
    }
}
