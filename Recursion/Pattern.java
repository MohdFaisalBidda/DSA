package Recursion;

import java.util.Arrays;

public class Pattern {
    public static void main(String[] args) {
        // triangle2(4, 0);
        int[] arr = { 4, 3, 2, 1 };
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void triangle(int row, int col) {
        if (row == 0)
            return;
        if (col < row) {
            System.out.print("* ");
            triangle(row, col + 1);
        } else {
            System.out.println();
            triangle(row - 1, 0);
        }
    }

    public static void triangle2(int row, int col) {
        if (row == 0)
            return;
        if (col < row) {
            triangle2(row, col + 1);
            System.out.print("* ");
        } else {
            triangle2(row - 1, 0);
            System.out.println();
        }
    }

    public static void bubble(int arr[], int row, int col) {
        if (row == 0)
            return;
        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            bubble(arr, row, col + 1);
        } else {
            bubble(arr, row - 1, 0);
        }
    }

    public static void selection(int[] arr, int row, int col, int max) {
        if (row == 0)
            return;
        if (col < row) {
            if (arr[col] > arr[max]) {
                selection(arr, row, col + 1, col);
            } else {
                selection(arr, row, col + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;
            selection(arr, row - 1, 0, 0);
        }
    }
}
