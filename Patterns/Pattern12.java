package Patterns;

public class Pattern12 {
  public static void main(String[] args) {
    pattern12(5);
  }

  public static void pattern12(int n) {

    for (int row = 1; row <= 2*n; row++) {
 int totalColInRow= row > n?row-n:n-row+1;
   int spaces = n -totalColInRow;
      
      for (int s = 1; s <= spaces; s++) {
        System.out.print(" ");
      }
      for (int col = 1; col <=totalColInRow; col++) {
        System.out.print("* ");
      }
      
      System.out.println();
    }
  }
}
