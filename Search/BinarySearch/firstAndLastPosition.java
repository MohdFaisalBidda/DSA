package Search.BinarySearch;

import java.util.Arrays;

public class firstAndLastPosition {
  public static void main(String[] args) {
    int[] nums = { 5, 7, 7, 8, 8, 10 };
    System.out.println(Arrays.toString(searchRange(nums, 8)));
  }

  public static int[] searchRange(int[] nums, int target) {
    int[] ans = { -1, -1 };
    ans[0] = binarySearch(nums, target, true);
    ans[1] = binarySearch(nums, target, false);

    return ans;
  }

  public static int binarySearch(int[] nums, int target, boolean searchStart) {
    int ans = -1;

    int low = 0;
    int high = nums.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (target > nums[mid]) {
        low = mid + 1;
      } else if (target < nums[mid]) {
        high = mid - 1;
      } else {
        ans = mid;
        if (searchStart) {
          high = mid - 1;
        } else {
          low = mid + 1;
        }

      }
    }
    return ans;
  }
}