package Search.BinarySearch;

public class MountainArray {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
    System.out.println(ans(arr));

  }

  public static int ans(int[] arr) {
    int peak = findPeakElement(arr);
    if (peak != -1) {
      return orderAgnosticBS(arr, 3, 0, peak);
    } else {
      return orderAgnosticBS(arr, 3, peak + 1, arr.length - 1);
    }
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

  public static int orderAgnosticBS(int[] arr, int target, int start, int end) {

    boolean isAsc = arr[start] < arr[end];

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        return mid;
      }
      if (isAsc) {
        if (arr[mid] > target) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      } else {
        if (arr[mid] < target) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }
    return -1;
  }
}