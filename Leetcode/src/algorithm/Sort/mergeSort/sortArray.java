package algorithm.Sort.mergeSort;

/**
 * @author Wang Yin
 * @date 2022/5/15 15:19\
 *  912. 排序数组
 *  给你一个整数数组 nums，请你将该数组升序排列。
 */
public class sortArray {

    public static int[] temp;

    public static int[] sortArray(int[] nums) {
        temp = new int[nums.length];
        sort(nums,0,nums.length-1);
        return nums;
    }

    public static void sort(int[] nums, int start, int end) {
        if (start == end)
            return;

        int mid = start + (end - start)/2;
        sort(nums,start,mid);
        sort(nums,mid+1,end);

        merge(nums,start,mid,end);
    }

    private static void merge(int[] nums, int start, int mid, int end) {

        for (int i = start; i <= end; i++) {
            temp[i] = nums[i];
        }

        int i = start, j = mid + 1;
        for(int k = start; k <= end; k++) {
            if (i == mid + 1) {
                nums[k] = temp[j++];
            } else if (j == end + 1) {
                nums[k] = temp[i++];
            } else if (temp[i] > temp[j]) {
                nums[k] = temp[j++];
            } else {
                nums[k] = temp[i++];
            }
        }

    }

    public static void main(String[] args) {
        int[] data = new int[] {5,4,6,7,8};
        sortArray(data);
    }

}
