import java.util.Stack;

public class Offer31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stc = new Stack<>();
        int i = 0;
        for (int num : pushed) {
            stc.push(num);
            while (!stc.isEmpty() && stc.peek() == popped[i]) {
                stc.pop();
                i++;
            }
        }
        return stc.isEmpty();
    }
}
