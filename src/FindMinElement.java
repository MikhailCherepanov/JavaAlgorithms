public class FindMinElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println("Min is : " + findMinElement(arr));
    }

    public static Integer findMinElement(int[] array) {
        if (array.length == 0) {
            return null;
        }

        int min = array[0];

        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }
}
