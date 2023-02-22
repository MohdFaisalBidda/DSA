package Sort.CyclicSort;

import java.util.ArrayList;

public class FindDisappearedNumbers {
  public static void main(String[] args) {
    int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
    System.out.println(findDisappeared(arr));
  }

  public static ArrayList<Integer> findDisappeared(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correctIndex = arr[i] - 1;
      if (arr[i] != arr[correctIndex]) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
      } else {
        i++;
      }
    }
    ArrayList<Integer> ans = new ArrayList<>();
    for (int j = 0; j < arr.length; j++) {

      if (arr[j] != j + 1) {
        ans.add(j + 1);
      }
    }
    return ans;
  }
}