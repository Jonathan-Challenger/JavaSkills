package Array;

import java.util.Arrays;

/* This solution takes an array and duplicates all the zeros  */

public class dupZeros {
    private static void duplicateZeros (int[] arr) {
        int dups = 0;
        int len = arr.length - 1;

        for (int i = 0; i < len + 1; i++) {
            if (i > len - dups) {
                break;
            }
            if (arr[i] == 0) {
                if (i == len - dups) {
                    arr[len] = 0;
                    len--;
                    break;
                }
                dups++;
            }
        }
        int last = len - dups;

        for (int j = last; j >= 0; j--) {
            if (arr[j] == 0) {
                arr[j + dups] = 0;
                arr[j + --dups] = 0;
            } else {
                arr[j + dups] = arr[j];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 0, 2, 3, 1, 0, 9, 5};
        
        System.out.println("Array before duplicating zeros:");
        System.out.println(Arrays.toString(arr1));
        duplicateZeros(arr1);
        System.out.println("Array after duplicating zeros:");
        System.out.println(Arrays.toString(arr1));
    }
}
