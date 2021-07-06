package com.JonathanATM;

import java.util.Arrays;

public class QuickSort02 {
    static void quickSort02(int[] seq, int low, int high){
        int mid = (low + high) / 2;
        int i = low;
        int j = high;
        int pivot = seq[mid];

        while (i <= j){
            while (seq[i] < pivot){
                i++;
            }
            while (seq[j] > pivot){
                j--;
            }
            if (i <= j){
                int temp = seq[i];
                seq[i] = seq[j];
                seq[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j){
            quickSort02(seq, low, j);
        }
        if (high > i){
            quickSort02(seq, i, high);
        }
    }

    public static void main(String[] args){
        int[] arr1 = {9, 3, 65, 7, 2, 12, 32, 14, 9, 5, 87};
        System.out.println("List before sorting:");
        System.out.println(Arrays.toString(arr1));
        quickSort02(arr1, 0, arr1.length - 1);
        System.out.println("List after sorting:");
        System.out.println(Arrays.toString(arr1));
    }

}
