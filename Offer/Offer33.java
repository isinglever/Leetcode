public class Offer33 {
    public boolean verifyPostOrder(int[] postOrder) {
        return recur(postOrder, 0, postOrder.length - 1);
    }
    
    boolean recur(int[] postOrder, int i, int j) {
        if (i >= j) return true;
        int p = i;
        while (postOrder[p] < postOrder[j]) p++;
        int m = p;
        while (postOrder[p] > postOrder[j]) p++;
        return p == j && recur(postOrder, i, m - 1) && recur(postOrder, m, j - 1);
    }
}
