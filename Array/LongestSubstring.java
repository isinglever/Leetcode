import java.util.HashMap;
import java.util.HashSet;
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
//        char[] ch = s.toCharArray();
//        HashSet<Character> result = new HashSet<Character>();
//        for (int i = 0; i < ch.length; i++) {
//            result.add(ch[i]);
//        }
//        return result.size();
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0, j = 0; i < s.length(); ++i) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}
//https://leetcode.com/problems/longest-substring-without-repeating-characters/