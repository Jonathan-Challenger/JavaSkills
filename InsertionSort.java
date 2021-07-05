package com.JonathanATM;

public class InsertionSort {
    public static void insertionSort(int[] seq) {
        for (int i = 1; i < seq.length; i++) {
            int toSort = seq[i];
            int j = i - 1;
            while ((j > -1) && (seq[j] > toSort)) {
                seq[j + 1] = seq[j];
                j--;
            }

            seq[j + 1] = toSort;
        }
    }

    public static void main(String[] args) {
	    int[] arr1 = {9, 3, 65, 7, 2, 12, 32, 14, 9, 5, 87};

	    System.out.println("Before Insertion Sort");
	    for(int i: arr1){
	        System.out.print(i+" ");
        }
	    System.out.println();

	    insertionSort(arr1);

	    System.out.println("After Insertion Sort");
	    for(int i: arr1){
	        System.out.print(i+" ");
	    }
    }
}
