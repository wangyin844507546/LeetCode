import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySolution {

    public static void main(String[] args) {
         // System.out.println(findMedianSortedArrays(new int[] {1,2}, new int[] {3,4}));
        // System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
       List<List<Integer>> lists = threeSum(new int[] {-1, 0, 1, 2, -1, -4});
    }
    // 01
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

    // 02
    // Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
    public static int maxArea(int[] height) {
       int maxArea = 0;
/*        for (int i = 0 ; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (height[i] < height[j]) {
                    if (maxArea < height[i] * (j - i))
                        maxArea = height[i] * (j - i);
                } else {
                    if (maxArea < height[j] * (j - i))
                        maxArea = height[j] * (j - i);
                }
            }
        }
        return maxArea;*/

        int i = 0 , j = height.length - 1;

        while (i < j) {
            if (height[i] < height[j]) {
                maxArea = Math.max(maxArea, height[i] * (j - i));
                i++;
            } else {
                maxArea = Math.max(maxArea, height[j] * (j - i));
                j--;
            }
        }
        return maxArea;
    }

    // 03
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length-2; i ++) {
            for(int j = i+1; j < nums.length-1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        System.out.print(nums[i]);
                        System.out.print(nums[j]);
                        System.out.print(nums[k]);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        lists.add(list);
                        list.clear();
                    }
                }
            }
        }
        return lists;
    }
}
