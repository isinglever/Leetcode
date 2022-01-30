public class Offer13 {
    public int movingCount(int m, int n, int k) {
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
//                if (i%10 + i/10 + j%10 + j/10 <= k) ans++;
                if (i%10 + j%10 + i/10 + j/10 <= k) {
                    ans++;
                    System.out.println("count:" + i + " " + j);
                }
//                else break;
            }
            if (i%10 + i/10 > k) break;
        }
        return ans;
    }

    public static void main(String[] args) {
        Offer13 test = new Offer13();
        System.out.println(test.movingCount(38, 15, 9));
    }
}

