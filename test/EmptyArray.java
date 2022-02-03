public class EmptyArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 2; i < 5; i++) {
            array[i] = i;
        }
        for (int i : array) {
            System.out.println(array[i]);
        }
    }
}
