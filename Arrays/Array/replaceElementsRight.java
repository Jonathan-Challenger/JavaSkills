package Array;

import java.util.Arrays;

public class replaceElementsRight {

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        int n = arr.length;
        int max = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }
        arr[n - 1] = -1;

        System.out.println(Arrays.toString(arr));
    }
    
}
