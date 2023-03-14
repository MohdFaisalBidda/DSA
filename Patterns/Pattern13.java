package Patterns;

public class Pattern13 {
  public static void main(String[] args) {
    pattern13(5);
  }

  public static void pattern13(int n) {

    for (int row = 1; row <= n; row++) {
      int space = row < 5 ?n- row :0;
      int newCol = row == 5 ? 2 * n - 1 : row;
      for (int s = 1; s <= space; s++) {
        System.out.print(" ");
      }
      for (int col = 1; col <= newCol; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }

  }
}
