package Recursion;

public class Sort{
  public static void main(String[] args){
    int[] arr={1,3,14,5,7,8};
    System.out.println(isArraySorted(arr,0));
  }
  public static boolean isArraySorted(int[] arr,int i){
    if(i == arr.length -1){
      return true;
    }
    return arr[i] < arr[i+1] && isArraySorted(arr,i+1);
  }
} 