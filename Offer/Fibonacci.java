public class Fibonacci {
    public int fib(int n) {
        int i = 2;
        int[] ansArray = {0, 1, 1};
        if (n <= 2) return ansArray[n];
        while (i <= n) {
            ansArray[2] = (ansArray[0] + ansArray[1]) % 1000000007;
            ansArray[0] = ansArray[1];
            ansArray[1] = ansArray[2];

//            if (ansArray[2] >= 1000000007) ansArray[2] = (ansArray[2] - 1000000007);
            i++;
        }
        return ansArray[2];
        //return Math.floorMod(ansarray[2], (int) (1e9+7));
    }

    public static void main(String[] args) {
        Fibonacci test  = new Fibonacci();
        int n = 100;
        System.out.println(test.fib(n));
        //int maxValue = Integer.MAX_VALUE;

    }
}

//class Fibonacci {
//    public int fib(int n) {
//        final int MOD = 1000000007;
//        if (n < 2) {
//            return n;
//        }
//        int p = 0, q = 0, r = 1;
//        for (int i = 2; i <= n; ++i) {
//            p = q;
//            q = r;
//            r = (p + q) % MOD;
//        }
//        return r;
//    }
//}