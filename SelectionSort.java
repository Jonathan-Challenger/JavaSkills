package com.JonathanATM;

public class SelectionSort {
    public static void selectionSort(int[] seq){
        for (int i = 0; i < seq.length - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < seq.length; j++){
                if(seq[j] < seq[mini]){
                    mini = j;
                }
            }
            int smaller = seq[mini];
            if(mini != 1){
                seq[mini] = seq[i];
                seq[i] = smaller;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 3, 65, 7, 2, 12, 32, 14, 9, 5, 87};

        System.out.println("Before Selection Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        selectionSort(arr1);

        System.out.println("After Selection Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}
