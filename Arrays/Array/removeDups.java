package Array;

import java.util.Arrays;

public class removeDups {
    private static int removeDuplicates (int[] arr) {
        if (arr.length < 1){
            return 0;
        }
        int k = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[k] != arr[i]){
                k++;
                arr[k] = arr[i];
            }
        }
        return k + 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 2, 3, 4, 5, 5, 5};

        System.out.println("Length of array before removing:");
        System.out.println(arr1.length);
        System.out.println("Length of array after removing:");
        System.out.println(removeDuplicates(arr1));
        System.out.println(Arrays.toString(arr1));
    }
    
}
