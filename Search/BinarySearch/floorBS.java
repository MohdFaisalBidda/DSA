package Search.BinarySearch;

public class floorBS {
  public static void main(String[] args) {
    int[] arr = { 1, 4, 6, 7, 9, 10, 12 };
    int target = 11;
    System.out.println(floor(arr, target));

  }

  static int floor(int[] arr, int target) {
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
    return end;
  }

}