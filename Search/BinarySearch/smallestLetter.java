package BinarySearch;

public class smallestLetter{
  public static void main(char[] args) {
  char[] arr = {'c','f','j'};
    char target = 'a';
    System.out.println(cieling(arr, target));

  }

static String cieling(char[] arr, char target) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (target > arr[mid]){   
       start = mid +1;
      }
      else{
        end = mid - 1;
      }

    }
    return arr[start % arr.length];

  }

}