package Patterns;

public class Pattern10 {
  public static void main(String[] args) {
    pattern10(5);
  }

  public static void pattern10(int n) {

    for (int row = 1; row <= n; row++) {
      for (int s = 1; s <= n - row; s++) {
        System.out.print(" ");
      }
      for (int col = 1; col <= row; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
