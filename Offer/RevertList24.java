public class RevertList24 {
//    Using Iteration
//    public ListNode reverseList(ListNode head) {
//        ListNode cur = head, tmp, pre = null;
//        while (cur != null) {
//            tmp = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = tmp;
//        }
//        return pre;
//    }

    public ListNode reverseList(ListNode head) {
        return recur(head, null);
    }
    private ListNode recur(ListNode cur, ListNode pre) {
        if (cur ==null) return pre;
        ListNode res = recur(cur.next, cur);
        cur.next = pre;
        return res;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
  }
}
