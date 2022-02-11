import java.util.HashMap;
import java.util.Map;

public class Offer35 {
    class Node {
        int val;
        Node next;
        Node random;
        
        public Node (int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    
    public Node copyRandomList (Node Head) {
        if (Head == null) return null;
        Node cur = Head;
        Map<Node, Node> map = new HashMap<>();
        while (cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = Head;
        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(Head);
    }
}
