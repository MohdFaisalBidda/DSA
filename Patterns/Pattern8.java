package Patterns;

public class Pattern8 {
  public static void main(String[] args) {
    pattern8(5);
  }

  public static void pattern8(int n) {

    for (int row = 1; row <= n; row++) {
      for (int s = 1; s <= n - row; s++) {
        System.out.print(" ");
      }
      for (int col = 1; col <= row; col++) {
        System.out.print("*");
      }

      for (int col = 1; col <= row - 1; col++) {
        System.out.print("1");
      }
      System.out.println();
    }
  }
}
