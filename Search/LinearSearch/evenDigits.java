package Search.LinearSearch;

public class evenDigits {
  public static void main(String[] args) {
    int[] arr = { 2, 23, 4, 2345, 235, 55 };
    System.out.println(findNumbers(arr));
    System.out.println(digits2(2345));

  }

  public static int findNumbers(int[] arr) {
    int count = 0;
    for (int num : arr) {
      if (even(num)) {
        count++;
      }
    }
    return count;
  }

  public static boolean even(int num) {
    int digitsInNum = digits(num);
    return digitsInNum % 2 == 0;
  }

  public static int digits(int num) {
    int count = 0;
    while (num > 0) {
      count++;
      num = num / 10;
    }
    return count;
  }

  public static int digits2(int num) {
    return (int) (Math.log10(num) + 1);
  }
}