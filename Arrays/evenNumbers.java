package Array;

/*
Given an array of integers this will find how many of the elements
have an even number of digits.
 */

public class evenNumbers {
    private static int evenDigits(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            String s = Integer.toString(arr[i]);
            if (s.length() % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {23, 1, 654, 8787, 93895, 43};

        System.out.println("The number of items with and even number of digits is:");
        System.out.print(evenDigits(arr1));
    }
}
