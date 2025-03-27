public class PrintArray<T> {

    public void printK(int k) {
        System.out.println("K is " + k);
        System.out.println();
    }

    public void print(T[] arr) {
        System.out.print("Init array is ");
        for (T o : arr) {
            System.out.print(o + ", ");
        }
        System.out.println();
    }

    public void printArrayAndK(int[] numbers, int k) {
        print(numbers);
        printK(k);
    }

    public void print(int[] numbers) {
        System.out.print("Array is ");
        for (int o : numbers) {
            System.out.print(o + ", ");
        }
        System.out.println();
    }
}
