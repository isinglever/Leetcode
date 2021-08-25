
public class PlusOne {
    public int[] plusOne(int[] digits) {
//        if (digits[digits.length - 1] < 9) {
//            digits[digits.length - 1]++;
//        } else if (digits[digits.length - 1] == 9) {
//            digits[digits.length - 1] = 0;
//            digits[digits.length - 2] = 1
//        }
        StringBuilder number = new StringBuilder();
        for (int i : digits) {
            number.append(i);
        }
        long intNumber = Long.parseLong(number.toString());
        intNumber++;
        String sNumber = Long.toString(intNumber);
        int[] result = new int[sNumber.length()];
        for (int i = 0; i < sNumber.length(); i++)
        {
            result[i] = sNumber.charAt(i) - '0';
        }
        return result;
    }
}
