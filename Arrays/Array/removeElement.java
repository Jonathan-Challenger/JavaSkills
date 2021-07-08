package Array;

import java.util.Arrays;

public class removeElement {
    private static int removesElement(int[] arr, int val) {
        if (arr.length < 1) {
            return 0;
        }
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[k++] = arr[i];
            }
        }
        return k;
    } 

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 9, 4, 3, 2};
        int val = 4;

        System.out.println("Length of array before removing:");
        System.out.println(arr1.length);
        System.out.println("Length of array after removing:");
        System.out.println(removesElement(arr1, val));
    }
    
}
