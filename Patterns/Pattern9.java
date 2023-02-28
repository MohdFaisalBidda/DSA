package Patterns;

public class Pattern9 {
  public static void main(String[] args) {
    pattern9(5);
  }

  public static void pattern9(int n) {

    for (int row = 1; row <= n; row++) {
      for (int s = 1; s <=row-1; s++) {
        System.out.print(" ");
      }
      for (int col = 1; col <=n-row+1; col++) {
        System.out.print("*");
      }

      for (int col = 1; col <=n-row; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
