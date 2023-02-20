package Search.BinarySearch;
// SAME SOLUTION
//1 >>https://leetcode.com/problems/find-peak-element/description/
//2 >>https://leetcode.com/problems/peak-index-in-a-mountain-array/


public class peakIndex {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1 };
    System.out.println(findPeakElement(arr));
  }

  public static int findPeakElement(int[] arr) {
    int low = 0;
    int high = arr.length - 1;
    while (low < high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] > arr[mid + 1]) {
        high = mid;
      } else {
        low = mid + 1;
      }

    }
    return low;

  }
}
