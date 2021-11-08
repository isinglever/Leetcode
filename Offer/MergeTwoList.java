public class MergeTwoList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(l1.val);
        ListNode l3 = temp;
        while(l1.next != null && l2.next != null) {
            if (l1.val <= l2.val) {
                l3.next = l1;
                l1 = l1.next;
            } else {
                l3.next = l2;
                l2 = l2.next;
            }
            l3 =l3.next;
        }
        l3.next = l1 != null ? l1 : l2;
        return temp.next;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }}
}
