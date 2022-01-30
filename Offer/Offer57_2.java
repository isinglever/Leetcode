import java.util.ArrayList;

public class Offer57_2 {
    public int[][] findContinuousSequence(int target) {
        int i = 1, j = 1;
        int sum = 0;
        ArrayList<int[]> ans = new ArrayList<>();
        
        while (i <= target/2) {
            if (sum < target) {
                sum += j;
                j++;
            }  else if (sum > target) {
                sum -= i;
                i++;
            } else {
                int[] res = new int[j - i];
                for (int k = i; k < j; k++) {
                    res[k-i] = k;
                }
                ans.add(res);
                sum -= i;
                i++;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
