import java.util.Stack;

public class InvertList {
    public int[] reversePrint(ListNode head) {
        /**
        int i = 0;
        ListNode temp = head;
        while (temp.next != null) {
            i++;
            temp= temp.next;
        }
        int[] array = new int[i];
        for (int j = 0; j < i; j++) {
            array[i-j] = head.val;
            head = head.next;
        }
        return array;
    }
         **/


        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i < size; i++) {
            print[i] = stack.pop().val;
        }
        return print;


    }
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
