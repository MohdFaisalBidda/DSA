package Search.LinearSearch;

public class maxNumberIn2DArray {
  public static void main(String[] args) {

  }

  public static int max(int[][] arr) {
    int max = Integer.MIN_VALUE;
    for (int[] rowItem : arr) {
      for (int colItem : rowItem) {
        if (colItem > max) {
          max = colItem;
        }
      }
    }
    return max;
  }
}