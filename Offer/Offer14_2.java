public class Offer14_2 {
    public int cuttingRope(int n) {
        if (n <= 3) return n - 1;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i <= n; i++) {
            int maxVal = 0;
            for (int j = 1; j <= i/2; j++) {
                maxVal = Math.max(maxVal, dp[j] * dp[i - j]);
            }
            dp[i] = maxVal;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Offer14_2 test = new Offer14_2();
        
        System.out.println(test.cuttingRope(8));
    }
}
