package array;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        /************Wrong Answer
        int n1 = nums1.length;
        int n2 = nums2.length;
        int count = 0;
        for (int i = 0; i < n1; i++) {
            int j = 0;
            while (j < n2) {
                if (nums1[i] == nums2[j]) {
                    count++;
                    break;
                }
                j++;
            }
        }
        int[] ans = new int[count];
        int point = 0;
        for (int i = 0; i < n1; i++) {
            int j = 0;
            while (j < n2) {
                if (nums1[i] == nums2[j]) {
                    ans[point] = nums1[i];
                    point++;
                    break;
                }
                j++;
            }
        }
        return ans;
         ******************************/
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }
}
