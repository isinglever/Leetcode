package array;

//import java.util.HashMap;

public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            int temp = 1;
            for (int j = 0; j < n; j++) {
                if (score[j] > score[i]) {
                    temp++;
                }
            }
            if (temp == 1) ans[i] = "Gold Medal";
            else if (temp == 2) ans[i] = "Silver Medal";
            else if (temp == 3) ans[i] = "Bronze Medal";
            else  ans[i] = String.valueOf(temp);

        }
        return ans;
    }
}
