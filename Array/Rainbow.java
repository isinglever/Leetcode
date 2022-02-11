public class Rainbow {
    public void rainbow (int[] test) {
        int a = 0, b = 0;
        int c = test.length;
        int d = test. length;
        while (b < test.length) {
            if (test[b] == 1) {
                a++;
                b++;
            }
            if (test[b] == 2) {
                
            }
        }
    }
    
    void swap (int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        Rainbow sort = new Rainbow();
        int[] test = {4,3,3,3,1,2,2,2,1,2,3,4};
        sort.rainbow(test);
        for (int i : test) {
            System.out.print(test[i])  ;
        }
    }
}
