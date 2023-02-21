package Sort.CyclicSort;

import java.util.Arrays;

public class CyclicSort {
  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1 };
    sort(arr);
    System.out.println(Arrays.toString((arr)));
  }

  public static void sort(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int elementCorrectIndex = arr[i] - 1;
      if (arr[i] != arr[elementCorrectIndex]) {
        int temp = arr[i];
        arr[i] = arr[elementCorrectIndex];
        arr[elementCorrectIndex] = temp;

      } else {
        i++;
      }
    }
  }
}