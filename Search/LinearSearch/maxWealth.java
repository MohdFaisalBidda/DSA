package Search.LinearSearch;

public class maxWealth {
  public static void main(String[] args) {
    int[][] arr = {
        { 3, 4, 5, 6 },
        { 3, 64, 7, 8 },
        { 2, 9, 3 },
        { 1, 2 }
    };
    System.out.println(wealth(arr));
  }

  public static int wealth(int[][] arr) {
    int max = Integer.MIN_VALUE;
    for (int[] row : arr) {
      int sum = 0;
      for (int col : row) {
        sum += col;
      }
      if (sum > max) {
        max = sum;
      }
    }
    return max;

  }
}