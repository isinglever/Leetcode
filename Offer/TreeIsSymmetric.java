public class TreeIsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return root == null || recur(root.right, root.left);
    }
    boolean recur(TreeNode R , TreeNode L) {
        if (R == null && L == null) return true;
        else if (R ==null || L ==null || L.val != R.val) return false;
        else return recur(L.right, R.left) && recur(L.right, R.left);
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
   }
}
