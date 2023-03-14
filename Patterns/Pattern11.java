package Patterns;

public class Pattern11 {
  public static void main(String[] args) {
    pattern11(5);
  }

  public static void pattern11(int n) {

    for (int row = 1; row <= n; row++) {
      for (int s = 1; s <= row - 1; s++) {
        System.out.print(" ");
      }
      for (int col = 1; col <= n - row + 1; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
