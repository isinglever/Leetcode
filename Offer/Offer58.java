public class Offer58 {
    public String reverseLeftWords(String s, int n) {
        StringBuilder ans = new StringBuilder();
        char[] res = s.toCharArray();
        for (int i = n; i < res.length; i++) {
            ans.append(res[i]);
        }
        for (int i = 0; i < n; i++) {
            ans.append(res[i]);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String abcdefg = "abcdefg";
        Offer58 test = new Offer58();
        System.out.println(test.reverseLeftWords(abcdefg, 3));
    }
}
