import java.util.Stack;

public class Offer30 {

    /** initialize your data structure here. */
    Stack<Integer> A, B;
    public Offer30() {
        A = new Stack<>();
        B = new Stack<>();
    }

    public void push(int x) {
        A.push(x);
        if (B.empty() || B.peek() > x) B.push(x);
    }

    public void pop() {
        if (A.pop() == B.peek()) B.pop();
    }

    public int top() {
        return A.peek();
    }

    public int min() {
        return B.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */

