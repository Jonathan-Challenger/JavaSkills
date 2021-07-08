package Array;

public class deletion {
    static int[] arr = new int[10];

    private static void printArray(int len) {
        for (int i = 0; i < len; i++){
            System.out.println("Index " + i + " contains " + arr[i]);
        }
    }


    public static void main(String[] args){
        int length = 0;

        // Filling the first 8 elements of arr 
        for (int i = 0; i < 8; i++){
            arr[length] = i;
            length++;
        }

        printArray(arr.length);

        System.out.println();

        // Deleting element from the end of an array

        printArray(length);

        length--;

        System.out.println();

        printArray(length);

        System.out.println();

        // Deleting element from the beginning of array

        for (int i = 1; i < length; i++){
            arr[i - 1] = arr[i];
        }

        length--;

        printArray(length);

        System.out.println();

        // Deleting an element from any index in array
        // Delete element at index 2

        for (int i = 3; i < length; i++) {
            arr[i - 1] = arr[i];
        }

        length--;

        printArray(length);
    }
}
