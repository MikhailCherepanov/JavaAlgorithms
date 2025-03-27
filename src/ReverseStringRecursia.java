public class ReverseStringRecursia {

    public static void main(String[] args) {
        String i = "hello";
        System.out.println("reverted - " + reverseString(i));
    }

    static String rev = "";

    public static String reverseString(String s)  {
        if (s.equals("")) {
            return rev;
        }

        char[] arr = s.toCharArray();
        rev = rev + arr[arr.length-1];
        String newS = s.substring(0,arr.length-1);

        return reverseString(newS);
    }


}
