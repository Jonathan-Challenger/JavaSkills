package com.JonathanATM.Arrays;


/*
This array problem takes in an array of 1s and 0s and
returns the maximum number of consecutive 1s in the array.
 */


public class maxConsecutiveOnes {
        private static int findOnes (int[] arr) {
            int maxCount = 0;
            int count = 0;
            for (int i: arr) {
                if (i == 1) {
                    if (++count > maxCount) {
                        maxCount = count;
                    }
                } else {
                    count = 0;
                }
            }
            return maxCount;
        }

        public static void main(String[] args) {
            int[] arr1 = {1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1};

            System.out.println("The number of max consecutive ones is: ");
            System.out.print(findOnes(arr1));
        }
}
