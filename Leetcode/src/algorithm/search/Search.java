package algorithm.search;

/**
 * @Author Wang Yin
 * @Date 2021/9/15 23:02
 *二分查找
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target，
 * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 */
public class Search {

    public static void main(String[] args) {
        search(new int[]{-1,0,3,5,9,11,12},2);
    }
    public static int search(int[] nums, int target) {
        return binarySearch(nums,0,nums.length,target);
    }

    public static int binarySearch(int[] nums,int left, int right,int target) {
        int index;
        while (left <= right) {
            index = left + (right - left) / 2;
            if (target < nums[index]) {
                right = index;
            } else if (target > nums[index]) {
                left = index;
            } else {
                return index;
            }
        }
        return -1;
    }

}
