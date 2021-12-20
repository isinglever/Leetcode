public class Offer39 {
    public int majorityElement(int[] nums) {
        int x = 0, vote = 0;
        for (int num : nums) {
            if (vote == 0) x = num;
            vote += num == x ? 1 : -1;
        }
        return x;
//        if (nums.length == 1) return nums[0];
//        for (int i = 0; i < nums.length / 2; i++) {
//            int index = 1;
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                  index++;
//                }
//            }
//            if (index > nums.length / 2) return nums[i];
//        }
//        return nums[0];
    } 
}