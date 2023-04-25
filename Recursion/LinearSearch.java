package Recursion;

public class LinearSearch {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 14,14, 5, 7, 8 };
    System.out.println(search(arr, 14, 0));
    System.out.println(searchIndex(arr, 14, 0));
    System.out.println(searchIndexLast(arr, 14, arr.length-1));
  }

  public static boolean search(int[] arr, int target, int i) {
    if (i == arr.length) {
      return false;
    } else {
      return arr[i] == target || search(arr, target, i + 1);
    }
  }

  public static int searchIndex(int[] arr, int target, int i) {
    if (i == arr.length) {
      return -1;
    }
    if (arr[i] == target) {
      return i;
    } else {
      return searchIndex(arr, target, i + 1);
    }
  }

  public static int searchIndexLast(int[] arr, int target, int i) {
    if (i == -1) {
      return -1;
    }
    if (arr[i] == target) {
      return i;
    } else {
      return searchIndexLast(arr, target, i - 1);
    }
  }
}