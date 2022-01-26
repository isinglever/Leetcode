public class Offer53 {    
/*
    public int search(int[] nums, int target) {
        int ans = 0;
        for (int num : nums) {
            if (num == target) ans = ans + 1;
            if (num > target) return ans;
        }
        return target;
    }
*/
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int medium = i + (j - i) / 2;
            if (nums[medium] < target) i = medium + 1;
            else j = medium - 1;
        }
        int right = i;
        while (i < j) {
            int medium = i + (j - i) / 2;
            if (nums[medium] >= target) j = medium - 1;
            else i = medium + 1;
        }
        int left = j;
        return right - left - 1;
    }
}
