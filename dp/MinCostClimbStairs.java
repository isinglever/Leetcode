class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int p =0, q = 0, r = 0;
        for (int i = 1; i < cost.length; i++) {
            r = Math.min(p + cost[i - 1], q + cost[i]);
            p = q;
            q = r;
        }
        return r;
    }
}
