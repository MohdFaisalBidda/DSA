package Search.BinarySearch;

public class OrderAgnosticBS {
  public static void main(String[] args) {
    int[] arr = { -18, -8, -4, -2, 0, 4, 6, 7, 8, 12, 18, 20 };
    System.out.println(orderAgnosticBS(arr, 18));
  }

  public static int orderAgnosticBS(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

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