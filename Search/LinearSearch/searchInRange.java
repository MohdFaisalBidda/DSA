package Search.LinearSearch;

public class searchInRange {
  public static void main(String[] args) {
    int[] arr = { 5, 4, -7, 2, 8, 1 };
    System.out.println(searchRange(arr, -7, 0, 3));

  }

  public static int searchRange(int[] arr, int target, int start, int end) {
    if (arr.length == 0) {
      return -1;
    }
    for (int i = start; i <= end; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;
  }

}
