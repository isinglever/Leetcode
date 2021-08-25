
public class MajorityElement {
    public int majorityElement(int[] nums) {

        /*************************
        int n = nums.length;
        int ans = 0;
        int count = 0;
        int i = 0;
        while (i < n) {
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                  count++;
                }
            }
            if (count > n/2) {
                ans = nums[i];
                break;
            }
            i++;
        }
        return ans;
         ******Wrong Answer******/

        int major=nums[0], count = 1;
        for (int i=1; i<nums.length;i++) {
            if (count==0){
                count++;
                major=nums[i];
            } else if (major==nums[i]) {
                count++;
            } else count--;

        }
        return major;
    }
}
