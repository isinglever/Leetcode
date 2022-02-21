public class Offer43 {
    public int countDigitOne(int n) {
        StringBuilder res = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            res.append(String.valueOf(i));
        }
        int ans = 0;
        for (int k = 0; k < res.length(); k++) {
            char tmp = res.charAt(k);
            if (tmp == '1') {ans++;
                System.out.println(tmp);}
        }
        System.out.println(ans);
       /* for (int j = 0; j < res.length(); j++) {
            System.out.print(res.charAt(j));
        }*/
        return res.length();
    }

    public static void main(String[] args) {
        Offer43 test = new Offer43();
        test.countDigitOne(132);
    }
}
