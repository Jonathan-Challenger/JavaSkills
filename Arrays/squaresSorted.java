package com.JonathanATM.Arrays;

import java.util.Arrays;

/*
This array problem takes an array of positive or negative numbers and
then squares all of the numbers and sorts them in ascending order.
*/


public class squaresSorted {
    private static void sortedSquares(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++){
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 2, 9, -7, 1 , -3, 8};

        System.out.println("Array before squaring and sorting:");
        System.out.println(Arrays.toString(arr1));
        sortedSquares(arr1);
        System.out.println("Array after squaring and sorting:");
        System.out.println(Arrays.toString(arr1));
    }
}
