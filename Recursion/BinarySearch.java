package Recursion;

public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 4, 6, 7, 8, 10 };
    System.out.println(BS(arr, 6, arr[0], arr.length - 1));

  }

  public static int BS(int[] arr, int x, int l, int h) {
    int mid = l + (h - l) / 2;
    if (arr[mid] == x) {
      return mid;
    } else if (arr[mid] > x) {
      return BS(arr, x, l, mid - 1);
    } else if (arr[mid] < x) {
      return BS(arr, x, mid + 1, h);
    }
    return -1;
  }
}
