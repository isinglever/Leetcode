import java.util.HashMap;

public class Offer50 {
    public char firstUniqChar(String s) {
        HashMap<Character, Boolean> map = new HashMap<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            map.put(c, !map.containsKey(c));
        }
        for (char c : charArray) {
            if (map.get(c)) return c;
        }
        return ' ';
    }
}
