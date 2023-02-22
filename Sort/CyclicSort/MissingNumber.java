package Sort.CyclicSort;

public class MissingNumber {
  public static void main(String[] args) {
    int[] arr = { 4, 0, 1, 2 };
    System.out.println(missingNumber(arr));
  }

  public static int missingNumber(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      // System.out.println(arr[arr[i]]);
      int correct = arr[i];
      if (arr[i] < arr.length && arr[i] != arr[correct]) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
      } else {
        i++;
      }
    }

    for (int j = 0; j < arr.length; j++) {
      if (arr[j] != j) {
        return j;
      }
    }
    return arr.length;
  }
}