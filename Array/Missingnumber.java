
import java.util.HashSet;
//import java.util.Set;

public class Missingnumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        HashSet<Integer> hashset = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hashset.add(nums[i]);
        }
        for (int j = 0; j < n + 1; j++) {
            if (!hashset.contains(j)) ans = j;
        }
        return ans;
    }
}
