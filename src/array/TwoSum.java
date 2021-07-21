package array;

//import org.jetbrains.annotations.NotNull;
public class TwoSum {
    public int[] twoSum(int[] num, int target) {
        int[] indice = new int[2];
        if (num == null || num.length < 2) return indice;
        int left = 0, right = num.length - 1;
        while (left < right) {
            int v = num[left] + num[right];
            if (v == target) {
                indice[0] = left + 1;
                indice[1] = right + 1;
                break;
            } else if (v > target) {
                right --;
            } else {
                left ++;
            }
        }
        return indice;
    }
    /*****************my answer**********************

     public int[] twoSum(int[] A, int target) {
        int n = A.length;
        int index1 = 0;
        int index2 = n -1;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(A[i] + A[j] == target) {
                    index1 = i;
                    index2 = j;
                }
            }
        }
        int[] ans = {index1, index2};
        return ans;
    }
     ******************************************/

}
