package array;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class TestDuplicate {
    public boolean containsDuplicate(int[] nums) {
        /****************
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) return true;
            }
        }
        return true;
         ******************/
        Set<Integer> hashset = new HashSet<>();
        for (int i : nums) {
            if (!hashset.add(i)) return true;
        }
        return false;
    }
}
