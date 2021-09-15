import java.util.HashSet;

public class RepeatNumber {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        int i = 0;
        HashSet<Integer> number = new HashSet();
        while (i < n) {
            if (!number.add(nums[i])) return nums[i];
            i++;
        }

        return 0;
    }

    public static void main(String[] args) {
        RepeatNumber rn = new RepeatNumber();
        int[] test = {0, 2, 4, 1, 2, 5, 6};
        System.out.println(rn.findRepeatNumber(test));
    }
}


/********************************************
 * class Solution {
 *     public int findRepeatNumber(int[] nums) {
 *         int i = 0;
 *         while(i < nums.length) {
 *             if(nums[i] == i) {
 *                 i++;
 *                 continue;
 *             }
 *             if(nums[nums[i]] == nums[i]) return nums[i];
 *             int tmp = nums[i];
 *             nums[i] = nums[tmp];
 *             nums[tmp] = tmp;
 *         }
 *         return -1;
 *     }
 * }
 *
 *
 */