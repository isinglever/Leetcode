public class Offer42 {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            ans = Math.max(nums[i], ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        Offer42 max = new Offer42();
        System.out.println(max.maxSubArray(arr));
    }
}
