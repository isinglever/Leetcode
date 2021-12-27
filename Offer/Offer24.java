import java.util.Stack;

public class Offer24 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {val = x;}
    }
    
    private ListNode recur(ListNode cur, ListNode pre) {
        if (cur == null) return pre;
        ListNode res = recur(cur.next, cur);
        cur.next = pre;
        return res;
    }
    public ListNode reverseList(ListNode head) {
        return recur(head, null);
        
/*      Using Double pointer, also called iteration
        ListNode cur = head;
        ListNode pre = null;
//        if (head == null) return null;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
*/
        
/*      Maybe this problem can't use stack to solve.
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        ListNode ans = new ListNode(-1);
        LinkNode cur = ans;
        while (!stack.empty()) {
            cur = cur.next = stack.pop();
        }
        cur.next = null;
        return ans.next;
*/
    }
}
/**public static Node reverseList(Node head) {
 *//**
 * 头插法反转链表应该重视的是指针的变换过程
/* 新建一个新链表的头指针newHead *//*
Node newHead = new Node(-1);
    *//* 用两个指针来表示当前的节点和下一节点 *//*
    *//* next指针域每次表示为当前节点的下一节点，所以一开始就别再赋值了 *//*
    Node current = head;
    Node next = null;
*//* 开始判断并遍历原始的链表，构造新的链表 *//*
		while (current != null) {
                *//* 先让next指针移到当前节点的下一节点中去 *//*
                next = current.next;
                *//* 让现在的链表的第一个节点的下一指针域变成newHead的下一指针域 *//*
                *//* 但是newHead的一开始的下一指针域是null，所以相当于是让head变成了新链表的头结点 *//*
                *//* 但是后续的每一次就是让当前链表的头结点指向新链表的第一个节点(非newHead) *//*
                current.next = newHead.next;
                *//* 再让newHead指向当前链表的头节点 *//*
                newHead.next = current;
                *//* 移动当前节点到下一节点的位置 *//*
                current = next;
                }
                return newHead.next;
                }/*/
