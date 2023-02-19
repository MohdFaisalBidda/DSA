package Search.BinarySearch;

public class cielingBS {
  public static void main(String[] args) {
    int[] arr = { 1, 4, 6, 7, 9, 10, 12 };
    int target = 5;
    System.out.println(cieling(arr, target));

  }

  static int cieling(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }

    }
    return start;

  }

}