public class MiniArray {
    public int minArray(int[] numbers) {
        for (int i = 0; i < numbers.length-1; i++) {
            while (numbers[i] > numbers[i+1]) {
                return numbers[i+1];
            }
        }
        return numbers[0];
    }

    public static void main(String[] args) {
        MiniArray test = new MiniArray();
        int[] testArray = {3, 4, 5};
        System.out.println(test.minArray(testArray));
    }
}
