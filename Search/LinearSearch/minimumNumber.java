package Search.LinearSearch;

public class minimumNumber {
  public static void main(String[] args) {
    int[] arr = { 5, 4, 6, 3, 5, 8, -5, -2 };
    System.out.println(minimum(arr));
  }

  public static int minimum(int[] arr) {
    if (arr.length == 0) {
      return -1;
    }
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }
}