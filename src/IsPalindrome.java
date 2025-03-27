public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println("Is palindrome? - " + isPalindrome("Qabbaq1"));
    }

    public static boolean isPalindrome(String inputString) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetL = "abcdefghijklmnopqrstuvwxyz";

        String noSymbols = "";

        for (int i=0; i < inputString.length(); i++) {
            for (int j=0; j < alphabet.length(); j++) {
                if (inputString.charAt(i) == alphabet.charAt(j)) {
                    noSymbols = noSymbols + inputString.charAt(i);
                    break;
                }
            }
        }

        String res = "";
        for (int i=noSymbols.length()-1; i >= 0; i--) {
            res = res + noSymbols.charAt(i);
        }

        System.out.println("res : " + res);

        String res1 = "";
        String res2 = "";

        for (int i=0; i < noSymbols.length(); i++) {
            for (int j=0; j < alphabetC.length(); j++) {
                if (noSymbols.charAt(i) == alphabetC.charAt(j) || noSymbols.charAt(i) == alphabetL.charAt(j)) {
                    res1 = res1 + alphabetL.charAt(j);
                }
                if (res.charAt(i) == alphabetC.charAt(j) || res.charAt(i) == alphabetL.charAt(j)) {
                    res2 = res2 + alphabetL.charAt(j);
                }

            }
        }


        return res1.equals((res2)) ? true : false;

    }

}
