public class ArraySolution {

    public static void main(String[] args) {
         System.out.println(findMedianSortedArrays(new int[] {1,2}, new int[] {3,4}));
    }

    //    There are two sorted arrays nums1 and nums2 of size m and n respectively.
    //    Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
    //    You may assume nums1 and nums2 cannot be both empty.

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num = new int[nums1.length + nums2.length];
        int j = 0, k = 0;
        for(int i = 0; i < nums1.length + nums2.length; i++) {
            if (j == nums1.length) {
                num[i] = nums2[k];
                k++;
                continue;
            }
            if (k == nums2.length) {
                num[i] = nums1[j];
                j++;
                continue;
            }
            if (nums1[j] < nums2[k]) {
                num[i] = nums1[j];
                j++;
            } else {
                num[i] = nums2[k];
                k++;
            }
        }
        if (num.length % 2 == 0) {
            return (num[num.length / 2 - 1] + num[num.length / 2]) / 2.0;
        } else {
            return num[num.length / 2];
        }
    }
}
