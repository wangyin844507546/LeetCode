package algorithm.Sort;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Author Wang Yin
 * @Date 2021/9/12 17:26
 *  排序数组
 * 给你一个整数数组 nums，请你将该数组升序排列
 * 输入：nums = [5,2,3,1]
 * 输出：[1,2,3,5]
 */
public class sortArray {

    public static void main(String[] args) {
        quickSort(new int[] {5,2,3,1,4});
    }

    public static int[] sortArray(int[] nums) {
         Arrays.sort(nums);
         return nums;
    }

    /**
     * 冒泡排序
      * @param nums
     */
    public static void bubbleSort(int[] nums) {

    }

    /**
     * 选择排序
     * @param nums
     */
    public static void selectSort(int[] nums) {

    }

    /**
     * 归并排序
     * @param nums
     */
    public static void mergeSort(int[] nums) {

    }

    /**
     * 快速排序
     * @param nums
     */
    public static void quickSort(int[] nums) {
        quickSort(nums,0,nums.length - 1);

    }

    public static void quickSort(int[] nums,int low,int high) {
        if (low < high) {
            int index = doubleIndexPartition(nums,low,high);
            quickSort(nums,low,index-1);
            quickSort(nums,index+1,high);
        }
    }

    public static int doubleIndexPartition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int start = low;
        while (low < high) {
            while (low < high && nums[high] >= pivot) high--;
            while (low < high && nums[low] <= pivot) low++;
            if (low == high) {
                break;
            }
            swap(nums,start,high);
        }
        return low;
    }

    private static void swap(int[] nums, int low, int high) {
        int pivot = nums[low];
        nums[low] = nums[high];
        nums[high] = pivot;
    }


}
