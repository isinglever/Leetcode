public class Offer05 {
    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if (c == ' ') res.append("%20");
            else res.append(c);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String test = "Hello world";
        Offer05 ans = new Offer05();
        String an = ans.replaceSpace(test);
        System.out.println(an);
    }
}
