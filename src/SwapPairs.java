public class SwapPairs {
    public static void main(String[] args) {
        System.out.println(" Res: " + swapPairs("abcdefg"));
    }

    public static String swapPairs(String s) {
        String res = "";
        char lastCh = 0;
        int le = s.length();
        if (s.length()%2 != 0) {
            lastCh  = s.charAt(s.length()-1);
            le = le - 1;
        }
        
        for (int i=0; i < le; i=i+2) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i+1);
            res = res + c2 + c1;
        }

        res = lastCh == 0 ? res : res + lastCh;
        
        return res;
    }
    
}
