package Sort.CyclicSort;

import java.util.List;
import java.util.ArrayList;

public class AllDuplicateNumbers {
  public static void main(String[] args) {
    int[] arr = { 4,3,2,7,8,2,3,1 };
    System.out.println(allDuplicateNumbers(arr));
  }

  public static List<Integer> allDuplicateNumbers(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      // System.out.println(arr[arr[i]]);
      int correct = arr[i] - 1;
      if (arr[i] != arr[correct]) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
      } else {
        i++;
      }
    }

    List<Integer> ans = new ArrayList<>();
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] != j+1) {
        ans.add(arr[j]);
      }
    }
    return ans;
  }
}