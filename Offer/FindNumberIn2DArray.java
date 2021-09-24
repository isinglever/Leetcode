public class FindNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        /*if (target < matrix[0][0] || target > matrix[n][m]) return false;
        else {
         if ()
        }

         */

        for (int i =0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == target) return true;
            }
        }
        return false;
    }
}

//can't solve the problem
