package Patterns;

public class Pattern7 {
  public static void main(String[] args) {
    pattern7(5);
  }

  public static void pattern7(int n) {

    for (int row = 1; row <= n; row++) {
      for (int c = 1; c <= row-1; c++) {
        System.out.print(" ");
      }
      for (int col = 1; col <=n-row+1; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
