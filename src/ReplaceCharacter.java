public class ReplaceCharacter {

    public static void main(String[] args) {
        System.out.println(replaceCharacter("hello, world", 'o', 'a'));
    }

    public static String replaceCharacter(String inputString, char c1, char c2) {
        String res = "";
        for (int i=0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == c1) {
                res = res + c2;
            } else {
                res = res + inputString.charAt(i);
            }
        }
        return res;
    }

}
