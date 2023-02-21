package Sort.CyclicSort;

public class MissingNumber {
  public static void main(String[] args) {
    int[] arr = { 3, 0, 1 };
    System.out.println(missingNumber(arr));
  }

  public static int missingNumber(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int current =arr[i];
      if (arr[i] < arr.length && arr[i] != arr[current]) {
        int temp = i;
        i = arr[i];
        arr[i] = temp;
      } else {
        i++;
      }
    }

    for (int index = 0; index < arr.length; index++) {
      if (arr[index] != index) {
        return index;
      }

    }
    return arr.length;
  }
}