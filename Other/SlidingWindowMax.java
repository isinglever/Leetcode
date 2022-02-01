import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMax {
    public int[] maxSlidingWindow(int[] nums, int k) {
/*
 * using this method will lead to "time limit exceeded"
        int[] ans = new int[nums.length - k + 1];
        int left = 0, right = k - 1;
        while (left <= nums.length - k) {
            ans[left] = nums[left];
            for (int i = left; i <= right; i++) {
                if (nums[i] > ans[left])   ans[left] = nums[i];
            }
            left++;
            right++;
        }
        return ans;
*/
        /*using another way*/
        int[] ans = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!deque.isEmpty() && deque.peek() < i -k + 1) {
                deque.poll();
            }
            while (!deque.isEmpty() && nums[deque.pollLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offer(i);
            if (i >= k - 1) {
                ans[res++] = nums[deque.peek()];
            }
        }
        return ans;
    }
}
//https://leetcode.com/problems/sliding-window-maximum/discuss/65884/Java-O(n)-solution-using-deque-with-explanation