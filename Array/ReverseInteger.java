public class ReverseInteger {
    public int reverse(int x) {
        long ans = 0;
        long a;
        if (x < 0) a = Math.abs(x);
        else a = x;
        String temp = Long.toString(a);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newGuess[i] = temp.charAt(i) - '0';
        }
        for (int i = 0; i < newGuess.length; i++) {
            //System.out.print(newGuess[i]);
            ans = (long) (ans + newGuess[i] * Math.pow(10, i));
        }
        if (x < 0) ans = ans * (-1);
        if (ans > 2147483647  || ans < -2147483648) ans = 0;
        //int intans = Math.toIntExact(ans);
        return Math.toIntExact(ans);
    }

    public int solution(int x)
    {
        int result = 0;

        while (x != 0)
        {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result)
            { return 0; }
            result = newResult;
            x = x / 10;
        }

        return result;
    }

    public static void main(String[] args) {
        int a= -2147483648;
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(a));
    }
}
