class Solution {
    public int climbStairs(int n) {
        int a = 1, b =1, tmp;
        for (int i = 0; i < n; i++) {
            tmp = a + b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
