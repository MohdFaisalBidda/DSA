package Sort.SelectionSort;

import java.util.Arrays;

public class selectionSort {
  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1 };
    selection(arr);
    System.out.println(Arrays.toString(arr));

  }

  public static void selection(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int end = arr.length - i - 1;
      int greater = maxValue(arr, 0, end);
      int temp = arr[greater];
      arr[greater] = arr[end];
      arr[end] = temp;
    }
  }

  public static int maxValue(int[] arr, int start, int end) {
    int max = start;
    for (int i = start; i <= end; i++) {
      if (arr[max] < arr[i]) {
        max = i;
      }
    }
    return max;
  }

}