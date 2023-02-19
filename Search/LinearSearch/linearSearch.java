package Search.LinearSearch;

public class linearSearch {
  public static void main(String[] args) {
    int arr[] = { 5, 4, 3, 2, 1 };
    System.out.println(linear2(arr, 0));
    System.out.println(linear1(arr, 3));
    System.out.println(linear(arr, 5));

  }

  public static int linear(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;
  }

  public static int linear1(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }
    for (int num : arr) {
      if (num == target) {
        return num;
      }
    }
    return Integer.MAX_VALUE;
  }

  public static boolean linear2(int[] arr, int target) {
    if (arr.length == 0) {
      return false;
    }
    for (int num : arr) {
      if (num == target) {
        return true;
      }
    }
    return false;
  }
}