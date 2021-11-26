public class RevertList24 {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head, tmp, pre = null;
        while (cur != null) {
            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
  }
}
