public class RomanToInt {

    public static int convertSimpleRomanNum(String s) {
        switch (s) {
            case "I" :
                return 1;
            case "V" :
                return 5;
            case "X" :
                return 10;
            case "L" :
                return 50;
            case "C" :
                return 100;
            case "D" :
                return 500;
            case "M" :
                return 1000;
            default:
                return 0;
        }
    }



    public static int[] convertRomanNum(String s) {
        int[] arr = {0, 1};
        switch (s) {
            case "IV" :
                arr[0] = 4;
                return arr;
            case "IX" :
                arr[0] = 9;
                return arr;
            case "XL" :
                arr[0] = 40;
                return arr;
            case "XC" :
                arr[0] = 90;
                return arr;
            case "CD" :
                arr[0] = 400;
                return arr;
            case "CM" :
                arr[0] = 900;
                return arr;
            default:
                arr[0] =
                    convertSimpleRomanNum(String.valueOf(s.toCharArray()[0]));
//                            +
//                            convertSimpleRomanNum(String.valueOf(s.toCharArray()[1]));
                arr[1] = 0;
                return arr;
        }
    }

    public static void main(String[] args) {
        String roman = "MMCCCXCIX";
        System.out.println("Res " + romanToInt(roman));
    }
    public static int romanToInt(String s) {

        char[] chArr = s.toCharArray();
        int res = 0;

        for (int i = 0; i < chArr.length; i++) {
            if (i != chArr.length - 1) {
                res = res + convertRomanNum(String.valueOf(chArr[i]) + String.valueOf(chArr[i + 1]))[0];
                i = i + convertRomanNum(String.valueOf(chArr[i]) + String.valueOf(chArr[i + 1]))[1];
            } else {
                res = res + convertSimpleRomanNum(String.valueOf(chArr[i]));
            }
        }
        return res;
    }
}
