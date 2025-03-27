public class ShiftByOneCharacter {

    public static void main(String[] args) {
        System.out.println(" RES: " + shiftByOneCharacter("abc123XYz!"));
    }

    public static String shiftByOneCharacter(String s) {
        String alphabetC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetL = "abcdefghijklmnopqrstuvwxyz";
        String res = "";
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == alphabetC.charAt(alphabetC.length()-1)) {
                    res = res + alphabetC.charAt(0);
            }
            if (s.charAt(i) == alphabetL.charAt(alphabetL.length()-1)) {
                res = res + alphabetL.charAt(0);
            }

            for (int j=0; j<=alphabetC.length()-2; j++) {
                if (s.charAt(i) == alphabetC.charAt(j)) {
                    res = res + alphabetC.charAt(j+1);
                }
                if (s.charAt(i) == alphabetL.charAt(j)) {
                    res = res + alphabetL.charAt(j+1);
                }
            }
            if (res.length() <  (i + 1)) {
                res = res + s.charAt(i);
            }
        }

        return res;
    }



}
