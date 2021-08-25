
import java.util.Arrays;

public class FindLHS {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            int j = 0;
            while (j < n) {
                if (nums[i] == nums[j] || nums[i] ==nums[j] - 1)
                    temp++;
                j++;

                ans = Math.max(temp, ans);
            }
        }
        return ans;
    }
}
