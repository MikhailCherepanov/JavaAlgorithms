import java.util.ArrayList;
import java.util.List;

public class FibonachiRecursia {

    static List<Long> row = new ArrayList<>();

    public static void main(String[] args) {
        int i = 50;
        row.add(Long.valueOf(0));
        row.add(Long.valueOf(1));
        System.out.println("number - " + fibonacci(i));
    }




    public static long fibonacci(int n)  {
        System.out.println("N : " + n);
        if ( n == 0 ) {
            return row.get(0);
        }
        if ( n == 1 ) {
            return row.get(1);
        }

        Long numberToAdd = row.get(row.size() - 1) + row.get(row.size() - 2);

        row.add(numberToAdd);

        System.out.println("ROW: " + row);

        if ( n == (row.size() - 1)) {
            return row.get(n);
        }

        return fibonacci(n);
    }


}
