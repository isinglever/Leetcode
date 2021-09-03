import java.util.HashSet;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs = new HashSet();
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        for (int j = 1; j <= nums.length; j++) {
            if (hs.add(j)) ans = j;
        }
        return ans;
    }
//
//    public static void main(String[] args) {
//        int[] nums = {1, 2, 0};
//        int ans = 0;
//        int firstMissingPositive;
//        ans = firstMissingPositive
//        System.out.println(firstMiss);
//    }
}
