import java.util.Arrays;
import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> hs = new HashSet<>();
        int k = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if ((board[i][j]) != '.') {
                    board[i][j] = 0;
                    k++;
                }
                hs.add(board[i][j]);
                if (hs.size() < 9 - k) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
