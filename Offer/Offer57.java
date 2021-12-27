import java.util.HashMap;
import java.util.HashSet;

public class Offer57 {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int i = 0, j = nums.length - 1;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int s : set) {
            if (set.contains(target - s)) {
                ans[0] = s;
                ans[1] = target - s;
                return ans;
            }
        }
        return null;
    }
}
/*
        if (nums.length < 2) return null;
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            ans[0] = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (ans[0] + nums[j] == target) {
                    ans[1] = nums[j];
                    return ans;
                }
            }
        }
        return ans;
*/
/*
        int[] ans = new int[2];
        int i = 0, j = nums.length - 1;
        while (i < j) {
        if (nums[i] < target - nums[j]) i++;
        if (nums[i] > target - nums[j]) j--;
        if (nums[i] == target - nums[j]) {
        ans[0] = nums[i];
        ans[1] = nums[j];
        return ans;
        }
        }
        return null;
*/