package BinarySearch;
public class BinarySearch {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;

            } else if (nums[mid] < target) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] nums = {1,3,5,7,9,11};
        int target = 9;
        int result = search(nums, target);
        System.err.println("Target = 9\nindex is " + result);
    }
}
