public class Offer36 {
    class Node {
        int val;
        Node left;
        Node right;
        
        public Node() {}
        
        public Node(int val) {
            this.val = val;
        }
        
        public Node(int val, Node right, Node left) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    Node pre, head;
    public Node treeToDoubleList(Node root) {
        if (root == null) return null;
        inOrder(root);
        head.left = pre;
        pre.right = head;
        return head;
    }
    
    void inOrder(Node cur) {
        if (cur == null) return;
        inOrder(cur.left);
        if (pre != null) pre.right = cur;
        else head = cur;
        cur.left = pre;
        pre = cur;
        inOrder(cur.right);
    }
}
