package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums ={4,3,2,1};
        sort(nums, 0, nums.length -1);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] arr,int low ,int high){
        if(low >= high){
            return;
        }

        int s =low;
        int e=high;
        int mid =s +(e-s)/2;
        int pivot =arr[mid];

        while(s<=e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }

            if(s<=e){
                int temp =arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }

        sort(arr,low,e);
        sort(arr,s,high);
    }
}
