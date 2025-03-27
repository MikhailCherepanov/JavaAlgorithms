public class TransformString {


    public static void main(String[] args) {
        System.out.println(" Res : " + transformString("HelLo WoRld 123"));
    }


    public static String transformString(String inputString) {
        String alphabetC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetL = "abcdefghijklmnopqrstuvwxyz";
        String res = "";
        for (int i=0; i < inputString.length(); i++) {
            for (int j=0; j < alphabetC.length(); j++) {
                if (inputString.charAt(i) == alphabetC.charAt(j)) {
                    res = res + alphabetL.charAt(j);
                    break;
                }
                if (inputString.charAt(i) == alphabetL.charAt(j)) {
                    res = res + alphabetC.charAt(j);
                    break;
                }
            }
            if (res.length() <  (i + 1)) {
                res = res + inputString.charAt(i);
            }

        }
        return res;
    }


}
