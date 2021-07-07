package com.JonathanATM.Arrays;

public class insertion {
    static int[] arr = new int[10];

    private static void printArray(int len) {
        for (int i = 0; i < len; i++){
            System.out.println("Index " + i + " contains " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int length = 0;

        // Add 4 elements to array
        for (int i = 0; i < 4; i++){
            arr[length] = i;
            length++;
        }

        printArray(arr.length);

        System.out.println();

        // Adding a 5th element
        arr[length] = 10;
        length++;

        printArray(arr.length);

        System.out.println();

        // Inserting at start of array
        for (int i = 4; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = 20;

        printArray(arr.length);

        System.out.println();

        // Inserting at a given index in array
        // Insert element at index 2

        for (int i = arr.length - 2; i >= 2; i--) {
            arr[i + 1] = arr[i];
        }
        arr[2] = 15;

        printArray(arr.length);
    }
}
