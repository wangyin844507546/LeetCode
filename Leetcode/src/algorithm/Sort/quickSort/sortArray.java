package algorithm.Sort.quickSort;

/**
 * @author Wang Yin
 * @date 2022/5/15 15:59\
 *  912. 排序数组
 *  给你一个整数数组 nums，请你将该数组升序排列。
 */
public class sortArray {


    public static int[] sortArray(int[] nums) {
        sort(nums,0,nums.length-1);
        return nums;
    }

    private static void sort(int[] nums, int low, int high) {

        if(low >= high)
            return;
        int index = partition(nums,low,high);
        sort(nums,low,index-1);
        sort(nums,index+1,high);

    }

    public static int partition(int[] nums, int start, int end) {
        int pivot = nums[start];
        int i = start + 1;
        int j = end;
        while (i <= j) {

            while (i < end && nums[i] <= pivot) {
                i++;
            }

            while (j > start && nums[j] > pivot) {
                j--;
            }

            if (i >= j) {
                break;
            }

            swap(nums,i,j);

        }

        swap(nums,start,j);
        return j;
    }

    private static void swap(int[] nums, int low, int high) {
        int pivot = nums[low];
        nums[low] = nums[high];
        nums[high] = pivot;
    }

    public static void main(String[] args) {
        int[] data = new int[] {4,1,6,3,2,5};
        sortArray(data);
    }


}
