package com.JonathanATM;
import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public void quickSort(int[] seq) {
        quickSort(seq, 0, seq.length-1);
    }

    private void quickSort(int[] seq, int low, int high){
        if (low < high+1){
            int p = partition(seq, low, high);
            quickSort(seq, low, p-1);
            quickSort(seq, p+1, high);
        }
    }

    private void swap(int[] seq, int index1, int index2){
        int temp = seq[index1];
        seq[index1] = seq[index2];
        seq[index2] = temp;
    }

    private int getPivot(int low, int high){
        Random rand = new Random();
        return rand.nextInt((high-low) + 1) + low;
    }

    private int partition(int[] seq, int low, int high){
        swap(seq, low, getPivot(low, high));
        int border = low + 1;
        for (int i = border; i <= high; i++){
            if (seq[i] < seq[low]){
                swap(seq, i, border++);
            }
        }
        swap(seq, low, border - 1);
        return border-1;
    }

    public static void main(String[] args){
        QuickSort qs = new QuickSort();
        int[] arr1 = {9, 3, 65, 7, 2, 12, 32, 14, 9, 5, 87};
        System.out.println("List before sorting:");
        System.out.println(Arrays.toString(arr1));
        qs.quickSort(arr1);
        System.out.println("List after sorting");
        System.out.println(Arrays.toString(arr1));
    }
}