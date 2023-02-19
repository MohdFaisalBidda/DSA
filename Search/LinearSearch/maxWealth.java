package Search.LinearSearch;

public class maxWealth {
  public static void main(String[] args) {

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