package Patterns;

//Trick
//Step(1) >> Number of Rows or Number of lines = number of times the outer loop will run

//Step(2) >> For every row number identify how many columns are there

//Step(3): >> Type of element to print


public class Pattern1 {
  public static void main(String[] args) {
    pattern1(5);
  }

  public static void pattern1(int n) {

    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= n; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
