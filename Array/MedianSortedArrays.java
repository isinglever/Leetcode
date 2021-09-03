public class MedianSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergesort = new int[nums1.length + nums2.length];
        double ans;
        mergeArrays(nums1, nums2, mergesort);
//        for (int i=0; i < mergesort.length; i++)
//            System.out.print(mergesort[i] + " ");
//        System.out.println(mergesort.length);
        if (mergesort.length % 2 == 0) {
            Double a = (double) mergesort[mergesort.length/2 - 1];
            Double b = (double) mergesort[mergesort.length/2];
            ans = (a + b)/2;
        }
        else return mergesort[mergesort.length/2];
        return ans;
    }
    public static void mergeArrays(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) arr3[k++] = arr1[i++];
            else arr3[k++] = arr2[j++];
        }
        while (i < arr1.length) arr3[k++] = arr1[i++];
        while (j < arr2.length) arr3[k++] = arr2[j++];
    }

    public static void main(String[] args) {
        int[] arr1= {1, 3};
        int[] arr2 = {2, 4};
        int[] arr3 = new int[4];
//        mergeArrays(arr1, arr2, arr3);
        System.out.println(findMedianSortedArrays(arr1, arr2));
//        findMedianSortedArrays(arr1, arr2);
//        System.out.println("Array after merging");
//        for (int i=0; i < arr3.length; i++)
//            System.out.print(arr3[i] + " ");
    }
}

//links: https://leetcode.com/problems/median-of-two-sorted-arrays/
