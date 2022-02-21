public class Offer24 {
    
/*  using iterate method
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode perv = null;
            ListNode curr = head;
            while (curr != null) {
                ListNode next = curr.next;
                curr.next = perv;
                perv = curr;
                curr = next;
            }
            return perv;
        }
    }*/
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next = null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
