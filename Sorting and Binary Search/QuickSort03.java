package com.JonathanATM;

import java.util.Arrays;

public class QuickSort03 {
    static int[] quickSort03(int[] seq, int left, int right){
        if (left < right) {
            int pos = partition(seq, left, right);
            quickSort03(seq, left, pos - 1);
            quickSort03(seq, pos + 1, right);
        }
        return seq;
    }

    private static int partition(int[] seq, int left, int right){
        int i = left;
        int j = right - 1;
        int pivot = seq[right];

        while (i < j){
            while (i < right && seq[i] < pivot) {
                i++;
            }
            while (j > left && seq[j] > pivot) {
                j--;
            }
            if (i < j){
                int temp2 = seq[i];
                seq[i] = seq[j];
                seq[j] = temp2;
            }
        }
        if (seq[i] > pivot) {
            int temp = seq[i];
            seq[i] = seq[right];
            seq[right] = temp;
        }
        return i;
    }

    public static void main(String[] args){
        int[] arr = {22, 11, 88, 66, 55, 77, 33, 44};

        System.out.println("List before sorting:");
        System.out.println(Arrays.toString(arr));
        quickSort03(arr, 0, arr.length - 1);
        System.out.println("List after sorting:");
        System.out.println(Arrays.toString(arr));

    }
}
