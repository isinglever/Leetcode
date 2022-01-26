import java.util.HashSet;

public class Offer03 {    
    public int findRepeatNumber(int[] nums) {
        HashSet res = new HashSet();
        int ans = -1;
        for (int c : nums) {
            if (!res.add(c)) ans = c;
        }
        return ans;
    }
}
