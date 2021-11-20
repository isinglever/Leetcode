public class Exchange21 {
    public int[] exchange(int[] nums) {
        int i = 0, j = nums.length -1;
        while(i < j) {
            while(nums[i]%2 !=0) i++;
            while(nums[j]%2 ==0) j--;
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }
}
