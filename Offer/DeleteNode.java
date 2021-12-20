public class DeleteNode {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteNode(ListNode head, int val) {
        ListNode tmp = new ListNode(0);
        tmp.next = head;
        head = tmp;
        while(tmp.next != null) {
            if(tmp.next.val != val) tmp = tmp.next;
            else {
                tmp.next = tmp.next.next;
            }
        }
        return head.next;
    }
}


//class Solution {
//    public ListNode deleteNode(ListNode head, int val) {
//        ListNode temp = new ListNode(0);
//        temp.next = head;
//        head = temp;
//        while(temp.next!=null){
//            if(temp.next.val==val){
//                temp.next = temp.next.next;
//                return head.next;
//            }
//            temp = temp.next;
//        }
//        return head.next;
//    }
//}